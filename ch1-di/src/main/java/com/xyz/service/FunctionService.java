package com.xyz.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 8:50 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service    //1 声明当前的类是spring管理的一个bean
public class FunctionService {

    public String sayHello(String message) {
        return "Hello " + message;
    }
}
