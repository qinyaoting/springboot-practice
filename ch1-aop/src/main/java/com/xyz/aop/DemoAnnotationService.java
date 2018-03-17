package com.xyz.aop;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class DemoAnnotationService {


    // 业务方法, 增加注解, 使切面能找到该方法
    @Action(name = "注解式拦截add操作")
    public void add(){}

}
