package com.xyz;

import com.xyz.ann.CustomAnnotation;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@CustomAnnotation("com.xyz.service")    //包含了配置和自动扫描注解
public class DemoConfig {
}
