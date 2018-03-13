package com.xyz.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/13/18
 * Time: 8:53 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration      //4. 声明当前类是一个配置类
@ComponentScan("com.xyz")   //5. 自动扫描com.xyz包下使用@Component @Service @Repository...注释的类, 并注册为spring bean
public class DiConfig {
}
