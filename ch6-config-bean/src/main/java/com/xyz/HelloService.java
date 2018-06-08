package com.xyz;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/23/18
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello " +msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
