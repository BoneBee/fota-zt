package com.intest.common.tableData;

import com.intest.common.ro.GetDataRO;
import com.intest.common.ro.QueryWhereRO;
import com.intest.common.ro.SortRO;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author zhanghui
 * @create 2020-08-13 22:12
 */
@WebListener
public class SpringContextLoader implements ApplicationContextAware, ServletContextListener {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public void contextInitialized(ServletContextEvent sce) {

        // 装载Spring的Context
        try {
            if (applicationContext == null) {
                applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(sce.getServletContext());
            }
            System.out.println("系统spring配置装载成功~");
        } catch (Exception e) {

        }
    }

    /**
     * 通过注解得到类型
     *
     * @param clazz
     * @return
     */
    public static Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> clazz) {
        return applicationContext.getBeansWithAnnotation(clazz);

    }


    /**
     * 得到Class中包含有传入Annotation类型的方法
     *
     * @param clz
     *            Class类型
     * @param annoClz
     *            Annotation类型
     * @return 传入Annotation类型标记的方法
     * @throws Exception
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static List<DataTableClassMethod> getClassMethodByAnnotation(Class clz, Class annoClz) throws Exception {
        List<DataTableClassMethod> result = new ArrayList<DataTableClassMethod>();
        clz = Class.forName(clz.getName(), true, clz.getClassLoader());
        long count = new ArrayList<>(Arrays.asList(clz.getInterfaces()))
                .stream()
                .filter(m -> m.getName().equals("org.springframework.aop.framework.Advised"))
                .count();
        if (count > 0) {
            String objectName = clz.getName();
            int startIndex = objectName.indexOf("$$");
            String typeName = objectName.substring(0, startIndex);
            Class targetClz = Class.forName(typeName);

            for (Method method : targetClz.getMethods()) {
                if (method.getAnnotation(annoClz) != null) {
                    DataTableClassMethod method1 = new DataTableClassMethod();
                    Method originalMethod = clz.getMethod(method.getName(), method.getParameterTypes());

                    TableDataAnnotation annotation = method.getAnnotation(TableDataAnnotation.class);
                    method1.setMethod(originalMethod);
                    method1.setDataTableId(annotation.tableId());

                    result.add(method1);
                }
            }

        } else {

            for (Method method : clz.getMethods()) {

                if (method.getAnnotation(annoClz) != null) {
                    DataTableClassMethod method1 = new DataTableClassMethod();

                    TableDataAnnotation annotation = method.getAnnotation(TableDataAnnotation.class);
                    method1.setMethod(method);
                    method1.setDataTableId(annotation.tableId());

                    result.add(method1);
                }
            }
        }

        return result;
    }

    /**
     * create by: zhanghui
     * description: 转发表格数据查询方法
     * create time: 2020/8/24 14:16
     *
     * @param model
     * @return java.lang.Object
     */
    public static Object DoMethodName(GetDataRO model) throws Exception {
        Object result = null;
        Map<String, Object> openClz = SpringContextLoader.getBeansWithAnnotation(TableDataAnnotation.class);

        if (openClz != null) {
            for (Object clzObj : openClz.values()) {

                List<DataTableClassMethod> methodList = getClassMethodByAnnotation(clzObj.getClass(), TableDataAnnotation.class);

                for (DataTableClassMethod dataTableClassMethod : methodList) {

                    //String methodName = method.getDeclaringClass().getSimpleName() + "." + method.getName();
                    //System.out.println(methodName + "tableID:" + annotation.tableId());
                    if (dataTableClassMethod.getDataTableId().equals(model.getTableId())) {
                        Parameter[] parameters = dataTableClassMethod.getMethod().getParameters();
                        if (parameters.length > 0) {
                            for (final Parameter p : parameters) {
                                Object obj = p.getType().newInstance();
                                List<Field> fields = GetAllFields(p.getType());

                                for (Field field : fields) {
                                    if (field.getName().equalsIgnoreCase("Pi")) {
                                        field.setAccessible(true);
                                        field.set(obj, model.getPi());
                                    }
                                    if (field.getName().equalsIgnoreCase("Ps")) {
                                        field.setAccessible(true);
                                        field.set(obj, model.getPs());
                                    }
                                    if (field.getName().equalsIgnoreCase("Sort")) {
                                        StringBuilder builder = new StringBuilder();
                                        if (model.getSort() != null && model.getSort().size() > 0) {
                                            for (int i = 0; i < model.getSort().size(); i++) {
                                                SortRO sortRo = model.getSort().get(i);
                                                if (sortRo.getSortOrder().equalsIgnoreCase("ascend") ||
                                                        sortRo.getSortOrder().equalsIgnoreCase("descend")) {
                                                    builder.append(sortRo.getDataPropertyName() + " ");
                                                    builder.append(sortRo.getSortOrder().equalsIgnoreCase("ascend") ? "ASC" : "DESC");
                                                    if (i < model.getSort().size() - 1) {
                                                        builder.append(",");
                                                    }
                                                }
                                            }
                                            field.setAccessible(true);
                                            field.set(obj, builder.toString());
                                        }
                                    }
                                    if (field.getName().equalsIgnoreCase("FullTextSearch")) {
                                        field.setAccessible(true);
                                        field.set(obj, model.getFullTextSearch());
                                    }

                                    // 查询条件赋值
                                    for (QueryWhereRO whereRO : model.getQueryWhere()) {
                                        if (field.getName().equals(whereRO.getFields())) {
                                            Type fieldType = field.getType();
                                            if (String.class.equals(fieldType)) {
                                                field.setAccessible(true);
                                                field.set(obj, whereRO.getValue());
                                            } else if (int.class.equals(fieldType)) {
                                                int _value = Integer.parseUnsignedInt(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (short.class.equals(fieldType)) {
                                                short _value = Short.parseShort(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (long.class.equals(fieldType)) {
                                                long _value = Long.parseLong(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (float.class.equals(fieldType)) {
                                                float _value = Float.parseFloat(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (double.class.equals(fieldType)) {
                                                double _value = Double.parseDouble(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (Date.class.equals(fieldType)) {
                                                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                                Date _value = formatter.parse(whereRO.getValue());
                                                field.setAccessible(true);
                                                field.set(obj, _value);
                                            } else if (Array.class.equals(fieldType)) {

                                            }
                                        }
                                    }

                                }

                                result = dataTableClassMethod.getMethod().invoke(clzObj, obj);
                            }
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * create by: zhanghui
     * description: 反射获取全部字段
     * create time: 2020/8/14 16:20
     *
     * @param typeClass
     * @return java.util.List<java.lang.reflect.Field>
     */
    private static List<Field> GetAllFields(Class<?> typeClass) {
        List<Field> fieldList = new ArrayList<>();
        Class tempClass = typeClass;
        while (tempClass != null && !tempClass.getName().toLowerCase().equals("java.lang.object")) {//当父类为null的时候说明到达了最上层的父类(Object类).
            fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
            tempClass = tempClass.getSuperclass(); //得到父类,然后赋给自己
        }
        return fieldList;
    }
}
