package com.wqy.cloud.cloudservice.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;


/**
 * 自定义的 Repository 需要继承 JpaRepository，这样的 Repository 接口就具备了通用的数据访问控制层的能力。
 * JpaSpecificationExecutor：不属于 Repository 体系，实现一组 JPA Criteria 查询相关的方法。
 * @param <T>
 * @param <ID>
 * @author wqy
 * @version 1.0 2020/10/9
 */
@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

}
