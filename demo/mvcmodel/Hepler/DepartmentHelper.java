package com.example.mvcmodel.Hepler;

import com.example.mvcmodel.Dao.DempartmentRespo;
import com.example.mvcmodel.Model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentHelper {

    @Autowired
    private DempartmentRespo dempartmentRespo;

    public List<Department> getAllDept() {
        return dempartmentRespo.getAllDept();
    }

    public Department getDeptById(int id) {
        return dempartmentRespo.getDeptById(id);
    }

    public void update(Department d) {
        dempartmentRespo.update(d);
    }

    public void addDept(Department d) {
        dempartmentRespo.addDept(d);
    }

    public void deleteDeptById(int id) {
        dempartmentRespo.deleteDeptById(id);
    }
}
