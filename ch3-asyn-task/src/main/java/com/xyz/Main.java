package com.xyz;

import com.xyz.conf.TaskExecutorConfig;
import com.xyz.service.TaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 9:06 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {


        // 执行异步任务, 配置类中初始化一个线程池,
        // 在service给需要异步执行的方法上添加注解
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        TaskService taskService = context.getBean(TaskService.class);


        for (int i =0;i<30;i++) {
            taskService.exeAsyncTasks(i);
            taskService.exeAsyncTasksPlus(i);
        }
        context.close();


    }
}
