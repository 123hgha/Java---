package com.example.reggie_take_out2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
public class ReggieTakeOut2Application {

    public static void main(String[] args) {
        SpringApplication.run(ReggieTakeOut2Application.class, args);
        log.info("项目启动成功");
    }

}
