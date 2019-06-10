package com.example.common.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ImportResource(value={"classpath*:application-web.xml","classpath*:application-jdbc.xml"})
public class ServletConfig {
}
