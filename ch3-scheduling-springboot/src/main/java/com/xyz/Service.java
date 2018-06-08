package com.xyz;

import org.springframework.format.datetime.joda.JodaDateTimeFormatAnnotationFormatterFactory;
import org.springframework.format.datetime.joda.JodaTimeContext;
import org.springframework.format.datetime.joda.JodaTimeContextHolder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    DateFormat sdf = SimpleDateFormat.getTimeInstance();
    // 单线程串行
    @Scheduled(cron = "*/10 * * * * ?")  //两10秒执行一次
    public void execute() throws InterruptedException {
        Thread cur = Thread.currentThread();
        System.out.printf("定时任务:%s name:%s %s \n" , cur.getId(), cur.getName(),
                sdf.format(System.currentTimeMillis()));

        //Thread.sleep(25000);
    }

    /*@Scheduled(cron = "*//*15 * * * * ?")  //两15秒执行一次
    public void execute2() {
        Thread cur = Thread.currentThread();
        System.out.printf("定时任务:%s name:%s %s \n" , cur.getId(), cur.getName(),
                sdf.format(System.currentTimeMillis()));
    }*/
}
