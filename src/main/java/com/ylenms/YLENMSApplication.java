package com.ylenms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ylenms
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class YLENMSApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(YLENMSApplication.class, args);
   
        System.out.println("YLENMS启动成功 ");
    }
}