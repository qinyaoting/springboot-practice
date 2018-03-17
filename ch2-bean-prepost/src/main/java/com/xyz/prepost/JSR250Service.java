package com.xyz.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class JSR250Service {

    @PostConstruct      //2.在构造函数后调用init方法
    public void init() {
        System.out.println("JSR250Service init");
    }

    public JSR250Service(){
        super();
        System.out.println("JSR250Service construct");
    }

    @PreDestroy         //在bean对象销毁前调用destroy方法
    public void destroy(){  //3.在销毁前调用destroy方法
        System.out.println("JSR250Service destroy");
    }
}
