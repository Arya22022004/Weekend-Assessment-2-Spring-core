package com.library.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class LoggingAspect {
    @Before("execution(* *(..))")
    public void logBeforeMethodExecution(JoinPoint joinPoint) {
        System.out.println("Before executing method: " + joinPoint.getSignature());
    }

    @After("execution(* *(..))")
    public void logAfterMethodExecution(JoinPoint joinPoint) {
        System.out.println("After executing method: " + joinPoint.getSignature());
    }
}