package com.example.service;

import com.example.domain.UserDomain;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2018/8/19.
 */
public interface UserService {
    public List<UserDomain> getAll();

    public UserDomain getOne(Long id);

    public void update(UserDomain user);

    public void demoUpdate() throws Exception;

    public void demoDoUpdate() throws Exception;
}
