package com.zhb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: 大冰
 * @Date: 2020/6/21 9:56
 */
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}
