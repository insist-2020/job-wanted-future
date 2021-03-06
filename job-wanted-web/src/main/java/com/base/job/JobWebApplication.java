package com.base.job;

import com.base.job.utils.ScheduledJsoup;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.base.job.dao")
@SpringBootApplication
public class JobWebApplication {

    @Autowired
    ScheduledJsoup scheduledJsoup;

    public static void main(String[] args) {
        SpringApplication.run(JobWebApplication.class,args);
        //new ScheduledJsoup().timingJsoup();
    }


}
