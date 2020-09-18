package com.intest.common.util;

import cn.hutool.json.JSONObject;
import org.apache.commons.httpclient.*;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.httpclient.params.HttpMethodParams;

import java.io.IOException;

/**
 * @author ：intest
 * @description：Http工具类
 * 模拟 get，post 请求并发送请求参数(json等)
 * @date ：2020/9/17 17:04
 */
public class HttpClientUtil {
    /**
     * get请求
     * @param url
     * @param charset
     * @return
     */
    public static String doGet(String url, String charset){
        HttpClient httpClient = new HttpClient();
        // 设置Http连接超时为5秒
        httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);

        GetMethod getMethod = new GetMethod(url);
        // 设置get请求超时为5秒
        getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
        // 设置请求重试处理，用的是默认的重试处理：请求三次
        getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());

        String response = "";

        // 执行HTTP GET请求
        try{
            int statusCode = httpClient.executeMethod(getMethod);
            // 判断访问的状态码
            if(statusCode != HttpStatus.SC_OK){
                System.err.println("请求出错："+ getMethod.getStatusLine());
            }

            Header[] headers = getMethod.getResponseHeaders();
            for(Header h : headers){
                System.out.println(h.getName() + "-----------------------" + h.getValue());
            }
            // 处理HTTP响应内容
            byte[] responseBody = getMethod.getResponseBody();
            response = new String(responseBody, charset);
            System.out.println("-------------response: " + response);
        }catch (HttpException e){
            System.out.println("请检查输入的URL!");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("发生网络异常！");
        }finally {
            getMethod.releaseConnection();
        }
        return response;
    }

    /**
     * post请求
     * @param url
     * @param json
     * @return
     */
    public static String doPost(String url, JSONObject json){
        HttpClient httpClient = new HttpClient();
        PostMethod postMethod = new PostMethod(url);

        postMethod.addRequestHeader("accept", "*/*");
        postMethod.addRequestHeader("connection", "Keep-Alive");
        // 设置json格式传送
        postMethod.addRequestHeader("Content-Type", "application/json;charset=utf-8");
        // 必须设置下面这个Header
        postMethod.addRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.81 Safari/537.36");

        String res = "";
        try{
            // 添加请求参数
            RequestEntity re = new StringRequestEntity(json.toString(), "application/json", "UTF-8");
            postMethod.setRequestEntity(re);

            int code = httpClient.executeMethod(postMethod);
            if(code == 200){
                res = postMethod.getResponseBodyAsString();
                System.out.println(res);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return res;
    }

    public static void main(String[] args){
        //doGet("http://192.168.1.114:62064/api/syncservice/AutoConfig?projectid=54EF2290-6C69-4A4B-8E8B-F92EFD66FE56", "UTF-8");
        JSONObject json = new JSONObject();
        json.set("userName", "pijie");
        json.set("password", "bjev.intest.fota");
        doPost("http://192.168.1.114:62064/api/Passport/Login", json);
    }
}
