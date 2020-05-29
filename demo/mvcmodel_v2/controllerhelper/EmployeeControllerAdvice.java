package com.example.mvcmodel.controllerhelper;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeControllerAdvice {
    //catch the exception thrown in service
    @ExceptionHandler(Exception.class)
    public void handleException(){
        System.out.println("exception is caught!");
    }
}
