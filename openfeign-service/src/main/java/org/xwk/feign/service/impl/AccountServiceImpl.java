package org.xwk.feign.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.xwk.feign.mapper.UserMapper;
import org.xwk.feign.model.po.User;
import org.xwk.feign.service.AccountService;

import java.util.List;

/**
 * @author xu wen kai
 * @date 2022/08/30 15:27
 */
@RestController
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUsers() {
        return userMapper.selectList(null);
    }

    @Override
    public User findOne(String id) {
        return userMapper.selectById(id);
    }
}
