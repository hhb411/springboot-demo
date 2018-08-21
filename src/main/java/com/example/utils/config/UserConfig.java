package com.example.utils.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 从user.properties载入 user.userName属性
 *
 * Created by hb on 2018/8/21.
 */
@Component
@ConfigurationProperties(prefix = "user")
@PropertySource("classpath:/user.properties")
public class UserConfig {
    private String userName; // 也可用 @Value("${user.userName}") 直接从properties载入

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
