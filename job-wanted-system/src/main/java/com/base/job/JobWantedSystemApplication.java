package com.base.job;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.base.job.dao")
public class JobWantedSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobWantedSystemApplication.class, args);
    }

}
