package com.wqy.cloud.cloudservice.dao.store.impl;

import com.wqy.cloud.cloudservice.dao.repository.UserRepository;
import com.wqy.cloud.cloudservice.dao.store.UserStore;
import com.wqy.cloud.cloudservice.model.entity.User;
import org.springframework.stereotype.Repository;

/**
 * User的Repository实现
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */
@Repository
public class UserStoreImpl extends BaseStoreImpl<User, String, UserRepository<User>> implements UserStore {

    @Override
    public User findByName(String name) {
        return repo.findByName(name);
    }
}
