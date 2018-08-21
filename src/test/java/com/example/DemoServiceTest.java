package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.service.DemoService;
/**
 * 测试引入的starter
 * Created by hb on 2018/8/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoServiceTest {
    @Autowired
    private DemoService demoService;

    @Test
    public void wrap() {
        System.out.println(demoService.wrap("abc"));
    }
}
