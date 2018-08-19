package com.example.service.impl;

import com.example.domain.UserDomain;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.utils.datasource.DataSourceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/19.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDomain> getAll() {
        return userMapper.getAll();
    }

    @Override
    public UserDomain getOne(Long id) {
        return userMapper.getOne(id);
    }

    @Override
    public void update(UserDomain user) {
        userMapper.update(user);
    }

    // 用于测试事务
    @Override
    @Transactional(rollbackFor = {Exception.class}) // @Transactional 有效
    public void demoUpdate() throws Exception {
        DataSourceContextHolder.setDB("ds2"); // 此处(在 @Transactional之后)切库无效, 若挪到UserServiceImplTest里切库则有效
        demoDoUpdate();
    }

    @Override
//    @Transactional(rollbackFor = {Exception.class}) // 此处@Transactional无效, 因为在同一个类中调用方法, 被调用的方法不会被拦截到。除非把此方法放到另一个类里, 并注入进来才行。
    public void demoDoUpdate() throws Exception {
        UserDomain user = userMapper.getOne(2L);
        user.setPassword(user.getPassword() + "(1)");
        userMapper.update(user);
        user.setPassword(user.getPassword() + "(2)");
        userMapper.update(user);

        List<UserDomain> users = userMapper.getAll();
        System.out.println(users.toString());
        throw new Exception("abc");
    }
}
