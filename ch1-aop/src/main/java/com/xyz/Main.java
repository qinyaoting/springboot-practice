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

        // 通常日志功能, 需要在业务代码中添加log.debug()这样的代码
        // 使用面向切面的方法，　来给法增加类似日志功能，　而不需要修改业务方法,
        //

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        // DemoAnnotationService类中add方法用注解进行了标注
        DemoAnnotationService annotationService =
                context.getBean(DemoAnnotationService.class);
        // DemoMethodService类中add方法就是一个普通的方法, 原有的逻辑都不用修改
        DemoMethodService methodService =
                context.getBean(DemoMethodService.class);

        annotationService.add();
        methodService.add();

        // 关键在 LogAspect中
        context.close();
    }
}
