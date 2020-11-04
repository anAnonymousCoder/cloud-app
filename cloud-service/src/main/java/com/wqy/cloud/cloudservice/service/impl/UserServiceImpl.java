package com.wqy.cloud.cloudservice.service.impl;

import com.wqy.cloud.cloudservice.dao.store.UserStore;
import com.wqy.cloud.cloudservice.model.entity.User;
import com.wqy.cloud.cloudservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * UserService实现类
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserStore userStore;

    /**
     * 保存用户
     *
     * @param user 用户对象
     * @return 保存后的用户对象
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public User saveUser(User user) {
        return userStore.save(user);
    }

    /**
     * 通过id查找用户
     *
     * @param id 用户id
     * @return 用户对象
     */
    @Override
    public User findUserById(String id) {
        if (StringUtils.isEmpty(id)) {
            return null;
        }
        return userStore.findById(id);
    }

    /**
     * 通过name查找用户
     *
     * @param name 用户name
     * @return 用户对象
     */
    @Override
    public User findUserByName(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        return userStore.findByName(name);
    }
}
