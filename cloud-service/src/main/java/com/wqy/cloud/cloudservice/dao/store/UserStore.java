package com.wqy.cloud.cloudservice.dao.store;


import com.wqy.cloud.cloudservice.dao.repository.UserRepository;
import com.wqy.cloud.cloudservice.model.entity.User;

/**
 * UserStore继承了RepositoryStore中的方法，并可以实现特有的方法
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */

public interface UserStore extends RepositoryStore<User, String, UserRepository<User>> {

    User findByName(String name);

}
