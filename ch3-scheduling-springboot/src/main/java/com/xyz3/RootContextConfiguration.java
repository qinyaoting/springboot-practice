package com.xyz3;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executor;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 6:27 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@EnableScheduling
@EnableAsync(
        mode = AdviceMode.PROXY, proxyTargetClass = false,
        order = Ordered.HIGHEST_PRECEDENCE
)
@ComponentScan(
        basePackages = "com.xyz3"
)
public class RootContextConfiguration implements AsyncConfigurer, SchedulingConfigurer {
    @Bean
    public ThreadPoolTaskScheduler taskScheduler()
    {
        ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(20);
        scheduler.setThreadNamePrefix("task-");
        scheduler.setAwaitTerminationSeconds(60);
        scheduler.setWaitForTasksToCompleteOnShutdown(true);
        return scheduler;
    }

    @Override
    public Executor getAsyncExecutor()
    {
        Executor executor = this.taskScheduler();
        return executor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

    @Override
    public void configureTasks(ScheduledTaskRegistrar registrar)
    {
        TaskScheduler scheduler = this.taskScheduler();
        registrar.setTaskScheduler(scheduler);
    }
}
