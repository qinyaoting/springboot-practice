package com.xyz;

import com.sun.deploy.net.protocol.ProtocolType;
import com.xyz.conf.ScopeConfig;
import com.xyz.service.PrototypeService;
import com.xyz.service.SingleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 8:54 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {


        // 默认的spring bean对象是singleton(单实例),
        // 如果需要每次从容器中获得新的对象, 需要给类增加注解@Scope("prototype")
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        SingleService s1 =
                context.getBean(SingleService.class);
        SingleService s2 =
                context.getBean(SingleService.class);

        PrototypeService p1 =
                context.getBean(PrototypeService.class);
        PrototypeService p2 =
                context.getBean(PrototypeService.class);

        System.out.println("s1于s2是否相等:" + s1.equals(s2));   //true
        System.out.println("p1于p2是否相等:" + p1.equals(p2));   //false
    }
}
