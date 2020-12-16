package com.wqy.cloud.core.dao;


import com.wqy.cloud.core.dao.repository.UserRepository;
import com.wqy.cloud.core.model.entity.User;

/**
 * UserStore继承了RepositoryStore中的方法，并可以实现特有的方法
 *
 * @author wqy
 * @version 1.0 2020/10/9
 */

public interface UserDao extends BaseDao<User, String, UserRepository<User>> {

    User findByName(String name);

}
