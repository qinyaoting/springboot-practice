package com.xyz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:07 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Main {

    public static void main(String[] args) {

        // 计划任务, 可以在固定的时间执行某个任务, 可以固定的频率(比如每隔5秒)执行某个任务
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfig.class);


    }
}
