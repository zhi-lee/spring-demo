package com.example.auth.web.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setUsername("root");
        druidDataSource.setUrl("password");
        druidDataSource.setPassword("1234");
        druidDataSource.setEnable(true);
        return druidDataSource;
    }
}
