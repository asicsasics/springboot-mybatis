package com.atguigu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author guoyuan
 * @create 2020-07-01 20:47
 */
@ServletComponentScan //扫描@WebListener  @WebFilter  @WebServlet
@EnableScheduling   //启动任务调度，底层是Quertz
@EnableTransactionManagement    //开启事务声明
@MapperScan("com.atguigu.dao")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}
