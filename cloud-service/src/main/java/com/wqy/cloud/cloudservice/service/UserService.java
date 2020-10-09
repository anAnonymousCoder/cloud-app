package com.wqy.cloud.cloudservice.service;

import com.wqy.cloud.cloudservice.model.entity.User;

/**
 * UserService接口
 * @author wqy
 * @version 1.0 2020/10/9
 */
public interface UserService {

    User saveUser(User user);

    User findUserById(String id);
}
