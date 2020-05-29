package com.example.mvcmodel.Controller;

import com.example.mvcmodel.Model.Employee;
import com.example.mvcmodel.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    //setter-based
    private EmployeeService employeeService;
    public EmployeeService getEmployeeService(){
        return employeeService;
    }
    @Autowired
    public void setEmployeeService(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    @ResponseBody
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Employee getEmplpyeeById(@PathVariable int id){
        return employeeService.getEmplpyeeById(id);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public void updateEmployee(@PathVariable int id, @RequestBody Employee temp) throws Exception{
        employeeService.updateEmployee(id,temp);
        throw new Exception("any exception");
    }

    @PostMapping("/add")
    @ResponseBody
    public void addNewEmployee(@RequestBody Employee temp){
        employeeService.addNewEmployee(temp);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteEmployeeById(@PathVariable int id) throws Exception{
        employeeService.deleteEmployeeById(id);
        throw new Exception("any exception in deletecontroller");
    }

//    @GetMapping("/thymeleaf")
//    public ModelAndView getEmployeeThymeleaf(){
//        ModelAndView mdl = new ModelAndView("index");
//        mdl.addObject("employees",employeeService.getAllEmployee());
//        return mdl;
//    }

}
