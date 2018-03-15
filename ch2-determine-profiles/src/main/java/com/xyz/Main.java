package com.xyz;

import com.xyz.profile.DemoBean;
import com.xyz.profile.ProfileConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 7:58 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 切换dev或者prod环境
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.refresh();

        DemoBean demoBean =
                context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());
        context.close();

    }
}
