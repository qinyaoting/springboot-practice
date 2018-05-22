package com.xyz.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 9:18 AM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service
public class TaskService {

    @Async
    public void exeAsyncTasks(Integer i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行异步任务:" + i);
    }

    @Async
    public void exeAsyncTasksPlus(Integer i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行异步任务2:" + i);
    }
}
