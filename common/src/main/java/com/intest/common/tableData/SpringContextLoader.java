package com.intest.common.tableData;

import com.sun.org.glassfish.gmbal.Description;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
    public static List<Method> getClassMethodByAnnotation(Class clz, Class annoClz) throws Exception {

        clz = Class.forName(clz.getName(), true, clz.getClassLoader());

        List<Method> result = new ArrayList<Method>();

        for (Method method : clz.getMethods()) {

            if (method.getAnnotation(annoClz) != null) {
                result.add(clz.getMethod(method.getName(), method.getParameterTypes()));
            }
        }

        return result;
    }

    /**
     * 打印注解对应的方法名
     * @throws Exception
     */
    public static Object DoMethodName(String tableId) throws Exception {
        Object result = null;
        Map<String, Object> openClz = SpringContextLoader.getBeansWithAnnotation(TableDataAnnotation.class);

        if (openClz != null) {
            for (Object clzObj : openClz.values()) {

                List<Method> methodList = getClassMethodByAnnotation(clzObj.getClass(), TableDataAnnotation.class);

                for (Method method : methodList) {

                    TableDataAnnotation annotation = method.getAnnotation(TableDataAnnotation.class);
                    String methodName = method.getDeclaringClass().getSimpleName() + "." + method.getName();
                    System.out.println(methodName + "tableID:" + annotation.tableId());
                    if (annotation.tableId().equals(tableId)) {
                        Parameter[] parameters = method.getParameters();
                        if (parameters.length > 0) {
                            for (final Parameter p : parameters) {
                                Object obj = p.getType().newInstance();
                                List<Field> fields = GetAllFields(p.getType());

                                for (Field field : fields) {
                                    if (field.getName().equals("Pi")) {
                                        field.setAccessible(true);
                                        field.set(obj, 1);
                                    }
                                    if (field.getName().equals("Ps")) {
                                        field.setAccessible(true);
                                        field.set(obj, 2);
                                    }
                                    if (field.getName().equals("Sort")) {
                                        field.setAccessible(true);
                                        String sort[] = new String[]{"CreateAt"};
                                        field.set(obj, sort);
                                    }
                                }

                                result = method.invoke(clzObj, obj);
                            }
                        }
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
