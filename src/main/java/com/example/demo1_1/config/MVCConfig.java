package com.example.demo1_1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MVCConfig implements WebMvcConfigurer {
//    public  static  String file=System.getProperty("user.dir")+"/";
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

//        System.out.println("上传地址为:"+file);

//        registry.addResourceHandler("/**").addResourceLocations("file://"+file);
        registry.addResourceHandler("/**").addResourceLocations("file:/d:/c1/");
    }
}
