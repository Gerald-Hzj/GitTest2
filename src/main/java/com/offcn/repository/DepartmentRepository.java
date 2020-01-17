package com.offcn.repository;

import com.offcn.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author 张招雄
 * @date 2020/1/17 10:44
 */

@RepositoryRestResource(collectionResourceRel = "departments", path = "departments")
public interface DepartmentRepository extends PagingAndSortingRepository<Department, String> {
    Department findByDepId(@Param("dep_id") String dep_id);
    List<Department> findAll();
    List<Department> findByDepName(@Param("dep_name") String dep_name);
    List<Department> findByMasterName(@Param("master_name") String master_name);
    List<Department> findBySlogan(@Param("slogan") String slogan);
}
