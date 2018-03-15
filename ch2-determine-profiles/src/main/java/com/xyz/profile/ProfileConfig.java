package com.xyz.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/15/18
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class ProfileConfig {


    @Bean
    @Profile("dev")
    public DemoBean devBeanDemo() {
        return new DemoBean("dev");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodBeanDemo() {
        return new DemoBean("prod");
    }
}
