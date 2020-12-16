package com.wqy.cloud.core.service;

import com.wqy.cloud.core.model.entity.User;

/**
 * UserService接口
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */
public interface UserService {

    User saveUser(User user);

    User findUserById(String id);

    User findUserByName(String name);
}
