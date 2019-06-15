package com.example.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ImportResource(value={"classpath*:application-*.xml"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ServletConfig {
}
