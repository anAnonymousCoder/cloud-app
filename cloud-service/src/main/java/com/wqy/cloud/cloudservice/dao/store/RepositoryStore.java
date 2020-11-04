package com.wqy.cloud.cloudservice.dao.store;

import com.wqy.cloud.cloudservice.dao.repository.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * 对BaseRepository进一步封装，抽离出需要的方法，不需要全部实现
 *
 * @param <T>
 * @param <ID>
 * @author wqy
 * @version 1.0 2020/10/9
 */

public interface RepositoryStore<T, ID, R extends BaseRepository<T, ID>> {

    T findById(ID id);

    List<T> findAll();

    <S extends T> S save(S entity);

    <S extends T> List<S> saveAll(Iterable<S> entities);

    List<T> findAllById(Iterable<ID> ids);

    void deleteById(ID id);

    void deleteByEntity(T entity);

    void deleteAllByEntity(Iterable<? extends T> entities);

    Page<T> page(Pageable pageable, Specification<T> spec);

    List<T> list(Specification<T> spec);
}
