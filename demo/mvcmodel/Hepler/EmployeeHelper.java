package com.example.mvcmodel.Hepler;

import com.example.mvcmodel.Model.Employee;
import com.example.mvcmodel.Dao.EmployeeRespo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeHelper {

    @Autowired
    private EmployeeRespo employeeRespo;

    public Employee getEmplpyeeById(int id){
        return employeeRespo.getEmplpyeeById(id);
    }

    public List<Employee> getAllEmployee() {
        return employeeRespo.getAllEmployee();
    }

    public void updateEmployee(int id, Employee temp) {
        employeeRespo.updateEmployee(id,temp);
    }

    public void addNewEmployee(Employee temp) {
        employeeRespo.addNewEmployee(temp);
    }

    public void deleteEmployeeById(int id) {
        employeeRespo.deleteEmployeeById(id);
    }
}
