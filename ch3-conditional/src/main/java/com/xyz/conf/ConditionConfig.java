package com.xyz.conf;

import com.xyz.condition.LinuxCondition;
import com.xyz.service.LinuxService;
import com.xyz.condition.WindowCondition;
import com.xyz.service.WindowsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:29 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowCondition.class)
    public WindowsService windowsService() {
        return new WindowsService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public LinuxService linuxService() {
        return new LinuxService();
    }
}
