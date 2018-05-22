package com.xyz.conf;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 9:07 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Configuration
@ComponentScan("com.xyz")
@EnableAsync        //1.开启异步任务
public class TaskExecutorConfig implements AsyncConfigurer {    //2.实现方法
    @Override
    public Executor getAsyncExecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(250);
        executor.initialize();
        return executor;        //创建线程池
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
