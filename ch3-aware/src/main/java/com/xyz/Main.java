package com.xyz;

import com.xyz.conf.AwareConf;
import com.xyz.service.AwareService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 8:18 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AwareConf.class);



        AwareService service =
                context.getBean(AwareService.class);
        service.outputResource();
        context.close();
    }
}
