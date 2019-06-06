package me.lhz.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AopTest {

    @Before("execution(* me.lhz.service.impl.*.*(..))")
    public void before(){
        System.out.println ("切面before执行了。。。。");
    }
    @After("execution(* me.lhz.service.impl.*.*(..))")
    public void after(){
        System.out.println ("切面after执行了。。。。");
    }
    @AfterReturning(pointcut = "execution(* me.lhz.service.impl.*.*(..))",returning = "retVal")
    public void afterReturning(Object retVal){
        System.out.println ("切面afterReturning执行了。。。。");
        System.out.println ("切面afterReturning执行了。。。。" + retVal.toString());
    }
}
