package com.example.mvcmodel.Controller;

import com.example.mvcmodel.Model.Department;
import com.example.mvcmodel.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/all")
    @ResponseBody
    public List<Department> getAllDept(){
        return departmentService.getAllDept();
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public Department getDeptById(@PathVariable int id){
        return departmentService.getDeptById(id);
    }

    @PutMapping("/update/{id}")
    @ResponseBody
    public void update(@PathVariable int id, @RequestBody Department d){
        departmentService.updateDepartment(id,d);
    }

    @PostMapping("/add")
    @ResponseBody
    public void addDept(@RequestBody Department d){
        departmentService.addDept(d);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public void deleteDeptById(@PathVariable int id){
        departmentService.deleteDeptById(id);
    }

}
