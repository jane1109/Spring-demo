package com.example.mvcmodel.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.engine.internal.JoinSequence;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
    @Before("execution(* com.example.mvcmodel.Service.*.get*(..))")
    public void beforeGet(){
        System.out.println("===============Get method is triggered!");
    }

    @Around("execution(* com.example.mvcmodel.Service.*.update*(..))")
    public Object aroundUpdate(ProceedingJoinPoint pjp){
        System.out.println("===========before around method");
        Object o = new Object();
        try{
            o = pjp.proceed();
        }catch (Throwable a){
            System.out.println("-----------error");
        }
        System.out.println("===========after around method");
        return o;
    }

    @AfterThrowing(value = "execution(* com.example.mvcmodel.Service.*.delete*(..))", throwing = "error")
    public void afterDelete(JoinPoint pjp, Throwable error){
        System.out.println("Method Signature: " + pjp.getSignature());
        System.out.println("Exceptin in delete: " + error);
    }
}
