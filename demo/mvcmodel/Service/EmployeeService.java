package com.example.mvcmodel.Service;

import com.example.mvcmodel.Hepler.EmployeeHelper;
import com.example.mvcmodel.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeHelper employeeHelper;

    public Employee getEmplpyeeById(int id) {
        return employeeHelper.getEmplpyeeById(id);
    }

    public List<Employee> getAllEmployee() {
        return employeeHelper.getAllEmployee();
    }

    public void updateEmployee(int id, Employee temp) {
        employeeHelper.updateEmployee(id,temp);
    }

    public void addNewEmployee(Employee temp) {
        employeeHelper.addNewEmployee(temp);
    }

    public void deleteEmployeeById(int id) {
        employeeHelper.deleteEmployeeById(id);
    }
}
