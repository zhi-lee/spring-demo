package com.example.mana.web;

import com.example.mana.web.config.data.DataSourceConfig;
import com.example.mana.web.config.servlet.ServletConfig;
import com.example.mana.web.shiro.ShiroConfig;
import com.example.mana.web.swagger.SwaggerConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class SpringDemoInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                //dataSource
                DataSourceConfig.class,
                //swagger
                SwaggerConfig.class
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
     * @return
     * @link javax.servlet.Filter
     */
    @Override
    protected Filter[] getServletFilters() {
        return super.getServletFilters();
    }

}
