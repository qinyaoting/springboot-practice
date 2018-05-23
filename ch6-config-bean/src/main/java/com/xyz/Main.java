package com.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/23/18
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        //TODO
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloServiceAutoConfiguration.class);
        HelloService s = context.getBean(HelloService.class);
        String tips = s.sayHello();
        System.out.println(tips);
    }
}
