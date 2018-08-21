package com.example.utils.config;

import com.example.controller.DemoController;
import com.example.domain.UserDomain;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by BO on 2018/8/21.
 */
@Configuration
public class JavaConfigDemo {
    @Bean
    public UserDomain user2() {
        UserDomain user = new UserDomain();
        user.setUserName("user2 - 用JavaConfig创建bean,自动注入");
        return user;
    }

    @Bean
    public UserDomain user3() {
        UserDomain user = new UserDomain();
        user.setUserName("user3 - 用JavaConfig创建bean,用JavaConfig注入");
        return user;
    }

    @Bean
    DemoController demoController() {
        DemoController demoController = new DemoController();
        demoController.setUser3(user3());
        System.out.println("创建 demoController: " + demoController);
        return demoController;
    }
}
