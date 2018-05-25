package com.xyz;

import com.xyz.prepost.BeanWayService;
import com.xyz.prepost.JSR250Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/14/18
 * Time: 10:06 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@ComponentScan("com.xyz.prepost")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")   //1.指定initmethod和destroymethod
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250Service jsr250Service() {
        return new JSR250Service();
    }
}
