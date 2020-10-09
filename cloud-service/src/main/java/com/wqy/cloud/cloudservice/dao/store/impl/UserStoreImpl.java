package com.wqy.cloud.cloudservice.dao.store.impl;

import com.wqy.cloud.cloudservice.dao.repository.UserRepository;
import com.wqy.cloud.cloudservice.dao.store.UserStore;
import com.wqy.cloud.cloudservice.model.entity.User;
import org.springframework.stereotype.Service;

/**
 * User的dao层实现
 * @author wqy
 * @version 1.0 2020/10/9
 */
@Service
public class UserStoreImpl extends BaseStoreImpl<User, String, UserRepository<User>> implements UserStore {

}
