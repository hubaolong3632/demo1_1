package com.example.demo1_1.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DataConfig implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 注意这里的路径依你的操作系统可能需要调整
        registry.addResourceHandler("/**").addResourceLocations("file:/D:/c1/");
    }
}
