package com.example.mvcmodel.Service;

import com.example.mvcmodel.Hepler.EmployeeHelper;
import com.example.mvcmodel.Model.Employee;
import com.oracle.tools.packager.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeHelper employeeHelper;

    static final Logger LOG = LoggerFactory.getLogger(EmployeeService.class);

    public Employee getEmplpyeeById(int id) {
        Log.info("************getEmployeeById is triggered!");
        return employeeHelper.getEmplpyeeById(id);
    }

    public List<Employee> getAllEmployee() {
        System.out.println("************getAllEmployee is triggered!");
        return employeeHelper.getAllEmployee();
    }

    public void updateEmployee(int id, Employee temp) {
        System.out.println("************inside before update employee");
        employeeHelper.updateEmployee(id,temp);
        System.out.println("************inside after update employee");
    }

    public void addNewEmployee(Employee temp) {
        employeeHelper.addNewEmployee(temp);
    }

    public void deleteEmployeeById(int id) throws Exception{
        System.out.println("************deleteEmployeeById is triggered!");
        employeeHelper.deleteEmployeeById(id);
        throw new Exception("any Exception in delelteservice");
    }


}
