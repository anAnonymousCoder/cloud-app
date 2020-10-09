package com.wqy.cloud.cloudservice.dao.repository;

import com.wqy.cloud.cloudservice.model.entity.User;

/**
 * 继承BaseRepository
 * @param <U>
 * @author wqy
 * @version 1.0 2020/10/9
 *
 */
public interface UserRepository<U extends User> extends BaseRepository<U, String> {
}
