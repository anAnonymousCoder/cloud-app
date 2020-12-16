package com.wqy.cloud.core.dao.repository;

import com.wqy.cloud.core.model.entity.User;

/**
 * 继承BaseRepository
 *
 * @param <U>
 * @author wqy
 * @version 1.0 2020/10/9
 */
public interface UserRepository<U extends User> extends BaseRepository<U, String> {

    U findByName(String name);

}
