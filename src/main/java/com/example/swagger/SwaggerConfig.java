package com.example.swagger;

import com.example.annotation.profile.Development;
import com.example.business.user.user.UserController;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackageClasses = UserController.class)
@Development
public class SwaggerConfig {
}
