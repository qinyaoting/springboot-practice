package com.xyz.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:08 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@ComponentScan("com.xyz")
@EnableScheduling
public class TaskConfig {
}
