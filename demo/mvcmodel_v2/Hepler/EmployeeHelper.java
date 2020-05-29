package com.example.mvcmodel.Hepler;

import com.example.mvcmodel.Dao.EmployeeRepository;
import com.example.mvcmodel.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeHelper {

    @Autowired
    private EmployeeRepository employeeRespo;

    public Employee getEmplpyeeById(int id){
        Optional<Employee> employeeOptional = employeeRespo.findById(id);
        if (employeeOptional.isPresent()){
            return employeeOptional.get();
        }else{
            return null;
        }
    }

    public List<Employee> getAllEmployee() {
        return employeeRespo.findAll();
    }


    public void updateEmployee(int id, Employee temp) {
        Optional<Employee> employeeOptional = employeeRespo.findById(id);
        if(!employeeOptional.isPresent()){
            return;
        }
        Employee employee = employeeOptional.get();
        employee.setName(temp.getName());
        employeeRespo.save(employee);
    }

    @Transactional
    public void addNewEmployee(Employee temp) {
        temp.setId(9999);
        employeeRespo.create(temp.getId(),temp.getName());
    }

    public void deleteEmployeeById(int id) {
        employeeRespo.deleteById(id);
    }


}
