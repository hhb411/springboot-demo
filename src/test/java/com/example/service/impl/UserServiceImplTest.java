package com.example.service.impl;

import com.example.service.UserService;
import com.example.utils.datasource.DataSourceContextHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by hb on 2018/8/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceImplTest {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @Test
    public void getAll() throws Exception {
    }

    @Test
    public void getOne() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    // 用于测试事务和动态数据源
    @Test
    public void demoUpdate() throws Exception {
        DataSourceContextHolder.setDB("ds2"); // 此处(在 @Transactional之前)切库有效
        userServiceImpl.demoUpdate();
    }

}