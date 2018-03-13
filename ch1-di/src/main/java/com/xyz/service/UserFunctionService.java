package com.xyz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 8:51 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service    //2 spring管理的bean对象 @Component @Service @Repository @Controller都是交给spring管理
public class UserFunctionService {

    @Autowired  //3 将FunctionService对象注入到UseFunctionService中
    private FunctionService functionService;

    public String sayHello(String h) {
        return functionService.sayHello(h);
    }
}
