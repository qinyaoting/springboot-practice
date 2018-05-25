package com.xyz;

import com.xyz.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {


        // 根据不同的条件, 返回不同的bean
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService service =
                context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name"));
        System.out.println(service.showListCommand());
        context.close();

    }
}
