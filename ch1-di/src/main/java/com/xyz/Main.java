package com.xyz;

import com.xyz.service.UserFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class); //6. 由配置类构造容器
        UserFunctionService service =
                context.getBean(UserFunctionService.class); //7. 获得声明配置的UseFunctionService对象
        System.out.println(service.sayHello("tomcat")); //8.调用对象的方法
        context.close();
    }
}
