package com.xyz;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 10:49 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@ComponentScan("com.xyz.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
