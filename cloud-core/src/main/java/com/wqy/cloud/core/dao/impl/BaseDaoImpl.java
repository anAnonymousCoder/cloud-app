package com.wqy.cloud.core.dao.impl;

import com.wqy.cloud.core.dao.repository.BaseRepository;
import com.wqy.cloud.core.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

/**
 * 基础Repository实现类
 *
 * @param <T>
 * @param <ID>
 * @param <R>
 * @author wqy
 * @version 1.0 2020/10/9
 */
public abstract class BaseDaoImpl<T, ID, R extends BaseRepository<T, ID>> implements BaseDao<T, ID, R> {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    protected R repo;

    @Override
    public T findById(ID id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return repo.findAll();
    }

    @Override
    public <S extends T> S save(S entity) {
        return repo.save(entity);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        return repo.saveAll(entities);
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        return repo.findAllById(ids);
    }

    @Override
    public void deleteById(ID id) {
        repo.deleteById(id);
    }

    @Override
    public void deleteByEntity(T entity) {
        repo.delete(entity);
    }

    @Override
    public void deleteAllByEntity(Iterable<? extends T> entities) {
        repo.deleteAll(entities);
    }

    @Override
    public Page<T> page(Pageable pageable, Specification<T> spec) {
        return repo.findAll(spec, pageable);
    }

    @Override
    public List<T> list(Specification<T> spec) {
        return repo.findAll(spec);
    }
}
