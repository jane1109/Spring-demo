package com.example.mvcmodel.Dao;

import com.example.mvcmodel.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

    @Modifying
    @Query(value="insert into employee(empid,name,deptid) values (:id, :name, 20)", nativeQuery = true)
    void create(@Param("id") int id, @Param("name") String name);

    List<Employee> findAllByDeptId(int deptName);

    @Procedure(procedureName = "spGenerateReport")
    List<Object> getSalaryReport(@Param("job_in") String job);


}
