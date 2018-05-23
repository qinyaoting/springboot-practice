package com.xyz;

import com.xyz.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:17 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 使用java配置类, 将一个类注入到另一个类中
        // 而不使用 @Service @Autowired

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService service = context.getBean(UseFunctionService.class);
        System.out.println(service.sayHello("Jack"));;
        context.close();

    }
}
