package com.xyz.conf;

import com.xyz.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 6:09 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class BeanConfig {

    @Bean
    @Profile("dev")
    public TestBean devTestBean() {
        return new TestBean("dev");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean() {
        return new TestBean("prod");
    }
}
