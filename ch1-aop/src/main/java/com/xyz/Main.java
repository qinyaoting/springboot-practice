package com.xyz;

import com.xyz.aop.DemoAnnotationService;
import com.xyz.aop.DemoMethodService;
import com.xyz.conf.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:35 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 使用面向切面的方法，　来给普通方法增加类日志功能，　
        // 好处是不用修改业务代码，　就可以增加功能

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService =
                context.getBean(DemoAnnotationService.class);

        DemoMethodService methodService =
                context.getBean(DemoMethodService.class);

        annotationService.add();
        methodService.add();
        context.close();
    }
}
