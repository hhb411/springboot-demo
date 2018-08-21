package com.example.controller;

import com.example.domain.UserDomain;
import com.example.utils.config.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hb on 2018/8/18.
 */
@Controller
@RequestMapping("demo")
public class DemoController {
    @Autowired
    private UserDomain user1; // 用xml创建bean,自动注入(配置在：springConfig.xml)

    @Autowired
    private UserDomain user2; // 用JavaConfig创建bean,自动注入(配置在：JavaConfigDemo)

    private UserDomain user3; // 用JavaConfig创建bean,用JavaConfig注入(配置在：JavaConfigDemo)

    @Autowired
    private UserConfig user4; //用JavaConfig创建bean,自动注入,从properteis文件载入属性(配置在UserConfig)

    public void setUser3(UserDomain user3) {
        this.user3 = user3;
    }

    @RequestMapping("xmlBeanDemo")
    @ResponseBody
    String xmlBeanDemo() {
        return "user1.userName: " + user1.getUserName() + "<br>" +
                "user2.userName: " + user2.getUserName() + "<br>" +
                "user3.userName: " + user3.getUserName() + "<br>" +
                "user4.UserName: " + user4.getUserName() + "<br>" +
                "this: " + this;
    }

    @RequestMapping("jspDemo")
    public String jspDemo() {
        return "userIndex";
    }

}

