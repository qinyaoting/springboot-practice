package com.xyz;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.retry.annotation.EnableRetry;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 5/3/18
 * Time: 3:57 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@SpringBootApplication
@EnableRetry
public class RetryApp {

    public static void main(String[] args) throws Exception {
        /*ApplicationContext context = new AnnotationConfigApplicationContext("com.xzy");
        RemoteService remoteService = context.getBean(RemoteService.class);
        remoteService.call();*/

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        RemoteService remoteService = context.getBean(RemoteService.class);
        remoteService.call();

        // TODO 10
        // 比如有10条记录,每条记录格式是url,keyword
        // 任务模板是打开url,输入keyword,输出html
        // 需要3个线程同时运行任务
        // 需要分配给3个线程, 不要阻塞在那里, 要一次分配完成

        // TODO 09
        // 批次保存到mysql

    }
}
