package com.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/23/18
 * Time: 11:08 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@EnableConfigurationProperties(HelloProperties.class)       //232.
@ConditionalOnClass(HelloService.class)          //233.
@ConditionalOnProperty(prefix = "hello", value = "enable", matchIfMissing = true)//234.
public class HelloServiceAutoConfiguration {

    @Autowired
    private HelloProperties properties;


    @Bean
    @ConditionalOnMissingBean(HelloService.class)       //235.
    public HelloService helloService() {
        HelloService service = new HelloService();
        service.setMsg(properties.getMsg());
        return service;
    }
}
