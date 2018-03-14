package com.xyz;

import com.xyz.conf.PrePostConfig;
import com.xyz.prepost.BeanWayService;
import com.xyz.prepost.JSR250Service;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 可以在创建bean后, 和bean销毁前, 添加一些动作
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250Service jsr250Service = context.getBean(JSR250Service.class);
        context.close();
    }
}
