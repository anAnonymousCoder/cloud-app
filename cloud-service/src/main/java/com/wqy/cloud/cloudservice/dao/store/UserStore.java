package com.wqy.cloud.cloudservice.dao.store;

import com.wqy.cloud.cloudservice.dao.repository.UserRepository;
import com.wqy.cloud.cloudservice.model.entity.User;

/**
 * User的真正的dao层
 * @author wqy
 * @version 1.0 2020/10/9
 */

public interface UserStore extends RepositoryStore<User, String, UserRepository<User>> {


}
