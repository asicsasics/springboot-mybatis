package com.atguigu.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author guoyuan
 * @create 2020-07-03 10:37
 */
@Component
public class TaskComponent {
    //@Scheduled(fixedDelay = 3000)//延迟三秒
    //@Scheduled(fixedRate = 3000)    //临界值，不超过为3s，超过按照超过的算
    //@Scheduled(cron = "0/5 * * * * *")//每个五秒执行一次
    @Scheduled(cron = "0 58 10 * * *")
    public void myTask() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(new Date()));
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
