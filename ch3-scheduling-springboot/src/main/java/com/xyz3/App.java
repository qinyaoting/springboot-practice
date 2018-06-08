package com.xyz3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext rootContext =
                new AnnotationConfigApplicationContext();
        rootContext.register(RootContextConfiguration.class);
        rootContext.refresh();
    }
}
