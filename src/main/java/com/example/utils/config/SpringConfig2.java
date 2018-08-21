package com.example.utils.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 引入xml配置
 *
 * Created by hb on 2018/8/21.
 */
@Configuration
@ImportResource(locations = {"classpath:/springConfig.xml"}) //引入xml
public class SpringConfig2 {

}
