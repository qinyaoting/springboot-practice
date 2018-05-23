package com.xyz;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/23/18
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@ConfigurationProperties(prefix = "hello")      //231.如果属性文件中有就读取hello.msg的值, 没有默认是world
public class HelloProperties {

    public static final String MSG = "world";

    private String msg = MSG;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
