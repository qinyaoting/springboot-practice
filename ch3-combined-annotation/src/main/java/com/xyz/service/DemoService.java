package com.xyz.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class DemoService {

    public void output() {
        System.out.println("从组合注解照样获得bean");
    }
}
