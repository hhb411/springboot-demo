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
 * Created by Administrator on 2018/8/19.
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

    @Test
    public void demoUpdate() throws Exception {
        DataSourceContextHolder.setDB("ds2");
        userServiceImpl.demoUpdate();
    }

}