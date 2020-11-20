package com.example.demo.aspect;

import com.example.demo.service.CheckStudentService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CheckUserAspect {

    @Autowired
    private CheckStudentService checkStudentService;

    @Pointcut("execution(public * com.example.demo.service.*.*(..))")//声明切入adminOnly
    public void checkAdmin(){

    }

    @Before("checkAdmin()")//拦截方式：前置通知
    public void before(JoinPoint joinPoint){
//        checkStudentService.check();
        System.out.println("-----前置通知-----" + joinPoint);
    }

    @After("checkAdmin()")//拦截方式：后置通知
    public void after(JoinPoint joinPoint){
        System.out.println("——————后置通知——————" + joinPoint);
    }

    @AfterReturning(value = "checkAdmin()", returning = "result")
    public void afterReturning(Object result){
        System.out.println("————返回通知————"+result);
    }

    @AfterThrowing(value = "checkAdmin()", throwing = "e")
    public void afterThrowing(Throwable e){
        System.out.println("————异常通知————"+e.getMessage());
    }

    @Around(value = "checkAdmin()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("————环绕通知前————");
        Object obj = joinPoint.proceed();
        System.out.println("————环绕通知后————");
        return obj;
    }
}
