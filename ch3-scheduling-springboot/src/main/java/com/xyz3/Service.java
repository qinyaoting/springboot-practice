package com.xyz3;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/25/18
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class Service {

    @Scheduled(cron = "0/10 * * * * ?")  //两10秒执行一次
    public void execute() {
        Thread cur = Thread.currentThread();
        System.out.printf("定时任务:%s name:%s \n\r" , cur.getId(), cur.getName());
    }
}
