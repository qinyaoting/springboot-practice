package com.xyz;

import com.xyz.conf.DemoConfig;
import com.xyz.service.DemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 不行.........
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DemoConfig.class);

        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println(beanNames);

        DemoService service =
                context.getBean(DemoService.class);
        service.output();
        context.close();

    }
}
