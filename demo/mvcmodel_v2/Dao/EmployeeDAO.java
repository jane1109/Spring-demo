//package com.example.mvcmodel.Dao;
//
//import com.example.mvcmodel.Model.Employee;
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Repository
//public class EmployeeDAO {
//
//    public static List<Employee> emp = new ArrayList<>();
//
//    static{
//        emp.add(new Employee(1,"sally",100.0));
//        emp.add(new Employee(2,"katie",50.0));
//        emp.add(new Employee(3,"ken",190.0));
//
//    }
//    //Respository/DAO是直接连接数据库的最底层，可以直接操作数据库，进行增删改查
//    public List<Employee> getAllEmployee(){
//        return emp;
//    }
//
//    public Employee getEmplpyeeById(int id){
//        return emp.stream().filter(employee -> id == employee.getEmpId()).findFirst().orElse(null);
//    }
//
//    public void updateEmployee(int id,Employee temp){
//        Employee target = this.getEmplpyeeById(id);
//        target.setName(temp.getName());
//    }
//
//    public void updateEmployee(Employee temp){
//        Employee target = emp.stream().filter(employee -> temp.getEmpId() == employee.getEmpId()).findFirst().orElse(null);
//        if (target != null){
//            target.setName(temp.getName());
//            target.setSalary(temp.getSalary());
//        }
//    }
//    public void addNewEmployee(Employee temp){
//        //temp should not exist in emp list
//        Employee check = emp.stream().filter(employee -> temp.getName().equals(employee.getName())).findFirst().orElse(null);
//        if(check == null){
//            int maxId = emp.stream().mapToInt(employee -> employee.getEmpId()).max().getAsInt();
//            temp.setEmpId(maxId+1);
//            emp.add(temp);
//        }
//    }
//
//    public void deleteEmployeeById(int id){
//        Iterator<Employee> it = emp.iterator();
//        while(it.hasNext()){
//            Employee temp = it.next();
//            if(id == temp.getEmpId()){
//                it.remove();
//            }
//        }
//    }
//}
