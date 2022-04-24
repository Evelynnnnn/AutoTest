package com.shilei.autotest.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.shilei.autotest.entity.Parameter;
import org.springframework.stereotype.Component;

import java.net.HttpCookie;
import java.util.List;
import java.util.Map;

/**
 * @author ShiLei
 * @date 2022/4/24 15:34
 * @project AutoTest
 * @email lei.shi@ai-ym.com
 */
@Component
public class HttpUtils {

    static void setHeader(HttpRequest request, Map<String, String> headerMap){
        request.addHeaders(headerMap);
    }

    static void setCookie(HttpRequest request,List<HttpCookie> cookieList){
        request.cookie(cookieList);
    }

    static void setToken(HttpRequest request,Map<String,String> token){
        request.addHeaders(token);
    }


    public static HttpRequest createSimpleGetRequest(String url){
        HttpRequest request = HttpUtil.createGet(url);
        return request;
    }

    public static HttpRequest createSimpleGetRequest(String url, Parameter parameter){
        NullUtil.check(parameter);
        url = url + "?" + parameter.getName() + "=" + parameter.getValue();
        HttpRequest request = HttpUtil.createGet(url);
        return request;
    }

    public static HttpRequest createSimpleGetRequest(String url, List<Parameter> parameters){
        NullUtil.checkList(parameters);
        url = url + "?";
        for (Parameter parameter : parameters){
            NullUtil.check(parameter);
            url = url + parameter.getName() + "=" + parameter.getValue();
            url = url + "&";
        }
        HttpRequest request = HttpUtil.createGet(url);
        return request;
    }

}
