package com.lxl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//注册与发现服务 Eureka服务 启动一个服务注册中心提供给其他应用进行对话
@SpringBootApplication
public class EurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerDemoApplication.class, args);
	}
}
