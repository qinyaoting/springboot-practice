package com.xyz.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Aspect     // 1. 声明为一个切面
@Component
public class LogAspect {

    @Pointcut("@annotation(com.xyz.aop.Action)")        //2. @Pointcut声明注解切点
    public void annotationPointCut(){};

    @After("annotationPointCut()")       //3. @After声明注解切点
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("拦截DemoAnnotationService:" + action.name());
    }

    /**
     * execution使用方法解释:
     *
     * 星号后边有个空格，　星号表示返回类型是任意
     * 后边是包名
     * DemoMethodService可以用星号代替, 表示包下全部类
     *　*(..):最后这个星号表示方法名，*号表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数。
     */

    @Before("execution(* com.xyz.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("拦截DemoMethodService:" + method.getName());
    }
}
