package com.offcn.repository;

import com.offcn.model.Class;
import com.offcn.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author 张招雄
 * @date 2020/1/19 9:11
 */
@RepositoryRestResource(collectionResourceRel = "classes", path = "classes")
public interface ClassRepositories extends PagingAndSortingRepository<Class, String> {
    Class findByClsId(@Param("cls_id") String cls_id);
    List<Class> findAll();
    List<Class> findByClsName(@Param("cls_name") String cls_name);
    List<Class> findByMasterName(@Param("master_name") String master_name);
    List<Class> findBySlogan(@Param("slogan") String slogan);
}
