package com.example.mapper;

import com.example.domain.UserDomain;
import com.example.utils.datasource.DataSourceContextHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hb on 2018/8/19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void update() throws Exception {
    }

    @Test
    public void getAll() throws Exception {
        DataSourceContextHolder.setDB("ds1");
        List<UserDomain> users = userMapper.getAll();
        DataSourceContextHolder.setDB("ds2");
        List<UserDomain> users2 = userMapper.getAll();
        users.addAll(users2);
        System.out.println(users.toString());
    }

}