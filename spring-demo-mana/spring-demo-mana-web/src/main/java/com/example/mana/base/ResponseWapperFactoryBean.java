package com.example.mana.base;


import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Modifier;


@ControllerAdvice
public class ResponseWapperFactoryBean implements ResponseBodyAdvice {

    @Override
    public boolean supports(MethodParameter method, Class converterType) {
        Class clazz = method.getMethod().getDeclaringClass();
        if (
                (clazz.getAnnotation(RestController.class) != null || clazz.getAnnotation(ResponseBody.class) != null)
                        && !clazz.isInterface()
                        && !Modifier.isAbstract(clazz.getModifiers())) {
            return true;
        }
        return method.hasMethodAnnotation(ResponseBody.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        return ServiceResponseHandle.ok(body);
    }

}
