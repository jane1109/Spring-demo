//package com.example.mvcmodel.Dao;
//
//import com.example.mvcmodel.Model.Department;
//import com.example.mvcmodel.Model.Employee;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Repository
//public class DempartmentRespo {
//
//    public static List<Department> dept = new ArrayList<>();
//
//    static{
//        dept.add(new Department(1,"sally","HR"));
//        dept.add(new Department(2,"katie","Finance"));
//        dept.add(new Department(3,"ken","Accounting"));
//
//    }
//    //Dao是直接连接数据库的最底层，可以直接操作数据库，进行增删改查
//    public List<Department> getAllDept(){
//        return dept;
//    }
//
//    public Department getDeptById(int id){
//        return dept.stream().filter(department -> id == department.getDepId()).findFirst().orElse(null);
//    }
//
//    public void update(Department d){
//        Department findDept = dept.stream().filter(department -> department.getDepId() == d.getDepId()).findFirst().orElse(null);
//        if(findDept != null){
//            findDept.setDeptName(d.getDeptName());
//            findDept.setManagerName(d.getManagerName());
//        }
//    }
//
//    public void addDept(Department d){
//        Department check = dept.stream().filter(department -> d.getDeptName().equals(department.getDeptName())).findFirst().orElse(null);
//        if(check == null){
//            int maxId = dept.stream().mapToInt(department -> department.getDepId()).max().getAsInt();
//            d.setDepId(maxId+1);
//            dept.add(d);
//        }
//    }
//
//    public void deleteDeptById(int id){
//        Department d = getDeptById(id);
//        if(d != null){
//            dept.remove(d);
//        }
//    }
//
//}
