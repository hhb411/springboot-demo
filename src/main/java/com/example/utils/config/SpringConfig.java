package com.example.utils.config;

import com.example.utils.interceptor.DemoInterceptor1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by BO on 2018/8/20.
 */
public class SpringConfig {
    // mvc配置器
//    @Configuration
//    static class WebMvcConfig implements WebMvcConfigurer {
//        private static final Logger log = LoggerFactory.getLogger(DemoInterceptor1.class);
//        //增加拦截器
//        public void addInterceptors(InterceptorRegistry registry){
//            log.info("创建 DemoInterceptor1");
//            registry.addInterceptor(new DemoInterceptor1()) //拦截器类
//                    .addPathPatterns("/demo/jspDemo"); //拦截的url
//        }
//    }

}
