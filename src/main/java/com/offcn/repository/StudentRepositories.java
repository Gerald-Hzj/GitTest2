package com.offcn.repository;

import com.offcn.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * @author 张招雄
 * @date 2020/1/19 9:11
 */
@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepositories extends PagingAndSortingRepository<Student, String> {
        Student findByStuId(@Param("stu_id") String stu_id);
        List<Student> findAll();
        List<Student> findByStuName(@Param("stu_name") String stu_name);
        }
