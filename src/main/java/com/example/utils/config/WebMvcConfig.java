package com.example.utils.config;

import com.example.utils.interceptor.DemoInterceptor1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * mvc配置器
 * WebMvcConfig相当于xml里的<mvc:>
 *
 * Created by hb on 2018/8/21.
 */
@Configuration
class WebMvcConfig implements WebMvcConfigurer {
    private static final Logger log = LoggerFactory.getLogger(DemoInterceptor1.class);
    //增加拦截器
    public void addInterceptors(InterceptorRegistry registry){
        log.info("创建 DemoInterceptor1");
        registry.addInterceptor(new DemoInterceptor1()) //拦截器类
                .addPathPatterns("/demo/jspDemo"); //拦截的url
    }
}