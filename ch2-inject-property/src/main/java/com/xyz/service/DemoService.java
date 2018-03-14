package com.xyz.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 9:30 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class DemoService {

    @Value("DemoService的属性信息")      //1
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
