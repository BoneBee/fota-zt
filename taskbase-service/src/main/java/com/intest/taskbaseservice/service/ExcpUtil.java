package com.intest.taskbaseservice.service;

/**
 * @作者:dl
 * @描述:异常信息获取工具类
 * @创建时间: 2020/4/13 14:24
 * @修改人：
 * @修改内容：
 * @修改时间：
 */
public class ExcpUtil {
    /*
     *异常堆栈信息获取
     */
    public static String getStackTraceString(Throwable ex){//(Exception ex) {
        StackTraceElement[] traceElements = ex.getStackTrace();

        StringBuilder traceBuilder = new StringBuilder();

        if (traceElements != null && traceElements.length > 0) {
            for (StackTraceElement traceElement : traceElements) {
                traceBuilder.append(traceElement.toString());
                traceBuilder.append("\n");
            }
        }

        return traceBuilder.toString();
    }
     /*
     *构造异常堆栈信息
      */
    public static String buildErrorMessage(Exception ex) {

        String result;
        String stackTrace = getStackTraceString(ex);
        String exceptionType = ex.toString();
        String exceptionMessage = ex.getMessage();

        result = String.format("%s : %s \r\n %s", exceptionType, exceptionMessage, stackTrace);

        return result;
    }
}
