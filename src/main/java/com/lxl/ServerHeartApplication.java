package com.lxl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @author: lxl
 * @date: 2018/1/23 16:48
 * @version: V 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServerHeartApplication {

    public static void main(String[] args){
        SpringApplication.run(ServerHeartApplication.class,args);
    }

    @Value("${server.port}")
    String port;

    //心跳
    @RequestMapping("/heart")
    public String heart(){
        return "heart...";
    }
}
