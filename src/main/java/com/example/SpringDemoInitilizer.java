package com.example;

import com.example.config.data.DataSourceConfig;
import com.example.config.servlet.ServletConfig;
import com.example.config.shiro.ShiroConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;

public class SpringDemoInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                //dataSource
                DataSourceConfig.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                //web环境配置
                ServletConfig.class,
                //权限验证配置
                ShiroConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    /**
     * 配置filter
     * @param servletContext
     * @param filter
     * @return
     */
    @Override
    protected FilterRegistration.Dynamic registerServletFilter(ServletContext servletContext, Filter filter) {
        return null;
    }
}
