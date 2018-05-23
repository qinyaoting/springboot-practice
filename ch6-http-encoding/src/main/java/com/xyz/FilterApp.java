package com.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/3/18
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
public class FilterApp {

    public static void main(String[] args) throws Exception {


        // 如何在springboot里配置web的编码过滤器

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(HttpEncodingProperties.class);



    }
}
