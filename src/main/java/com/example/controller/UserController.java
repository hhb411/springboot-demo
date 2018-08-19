package com.example.controller;

import com.example.domain.UserDomain;
import com.example.mapper.UserMapper;
import com.example.utils.datasource.DataSourceContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/8/18.
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUsers")
    public List<UserDomain> getUsers() {
        DataSourceContextHolder.setDB("ds1");
        List<UserDomain> users =userMapper.getAll();
//        DataSourceContextHolder.setDB("ds2");
        DataSourceContextHolder.resetDB();
        List<UserDomain> users2 = userMapper.getAll();

        users.addAll(users2);
        return users;
    }

    @RequestMapping("/getUser")
    public UserDomain getUser(Long id) {
        UserDomain user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping("/add")
    public void save(UserDomain user) {
        userMapper.insert(user);
    }

    @RequestMapping(value="update")
    public void update(UserDomain user) {
        userMapper.update(user);
    }

    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        userMapper.delete(id);
    }
}