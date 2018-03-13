package com.xyz.service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:09 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */

// 1. 没有@Service标注该类, 在JavaConfig中配置各个bean的关系
public class FunctionService {

    public String sayHello(String s) {
        return "Hello " + s;
    }
}
