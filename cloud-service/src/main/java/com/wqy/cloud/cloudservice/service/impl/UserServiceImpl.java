package com.wqy.cloud.cloudservice.service.impl;

import com.wqy.cloud.cloudservice.dao.store.UserStore;
import com.wqy.cloud.cloudservice.model.entity.User;
import com.wqy.cloud.cloudservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserService实现类
 * @author wqy
 * @version 1.0 2020/10/9
 */

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserStore userStore;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public User saveUser(User user) {
        return userStore.save(user);
    }

    @Override
    public User findUserById(String id) {
        return userStore.findById(id);
    }
}
