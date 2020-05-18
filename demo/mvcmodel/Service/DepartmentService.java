package com.example.mvcmodel.Service;

import com.example.mvcmodel.Hepler.DepartmentHelper;
import com.example.mvcmodel.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentHelper departmentHelper;

    public List<Department> getAllDept() {
        return departmentHelper.getAllDept();
    }

    public Department getDeptById(int id) {
        return departmentHelper.getDeptById(id);
    }

    public void update(Department d) {
        departmentHelper.update(d);
    }

    public void addDept(Department d) {
        departmentHelper.addDept(d);
    }

    public void deleteDeptById(int id) {
        departmentHelper.deleteDeptById(id);
    }
}
