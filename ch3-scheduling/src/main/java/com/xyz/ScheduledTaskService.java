package com.xyz;

import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: chin
 * Date: 3/16/18
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Service

public class ScheduledTaskService {

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔5秒执行一次:" + simpleDateFormat.format(new Date()));
    }

    @Scheduled(cron = "0 11 15 ? * *")
    public void fixTimeExecurot() {
        System.out.println("固定时间执行:" + simpleDateFormat.format(new Date()));
    }

    // 从属性文件中读取cron
    @Scheduled(cron="${job.schedule}")
    public void fromProperties() {
        System.out.println("从属性文件中读取cron" + simpleDateFormat.format(new Date()));
    }
}
