package com.example.mvcmodel.Hepler;

import com.example.mvcmodel.Dao.DepartmentRepository;
import com.example.mvcmodel.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class DepartmentHelper {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDept() {
        return departmentRepository.findAll();
    }

    public Department getDeptById(int id) {
        Optional<Department> departmentOptional = departmentRepository.findById(id);
        if(departmentOptional.isPresent()){
            return departmentOptional.get();
        }else {
            return null;
        }

    }

    public void updateDepartment(int id, Department d) {
        Optional<Department> departmentOptional = departmentRepository.findById(id);
        if(!departmentOptional.isPresent()){
            return;
        }
        Department department = departmentOptional.get();
        department.setName(d.getName());
        department.setLoc(d.getName());
        departmentRepository.save(department);
    }

    @Transactional
    public void addDept(Department d) {
        d.setDeptid(999);
        departmentRepository.create(d.getDeptid(),d.getName(),d.getLoc());
    }

    public void deleteDeptById(int id) {
        departmentRepository.deleteById(id);
    }
}
