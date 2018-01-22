package com.lxl.tools;

import com.lxl.controller.RestaurantController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

/**
 * @Description: 查找Eureka服务器中可用服务的所有实例
 * @author: lxl
 * @date: 2018/1/22 21:03
 * @version: V 1.0
 */
//@Component //泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注。
//@EnableDiscoveryClient  //激活eureka中的DiscoveryClient实现
public class DiscoveryClientSample implements CommandLineRunner{
    protected Logger logger = Logger.getLogger(RestaurantController.class.getName());

    @Autowired
    DiscoveryClient discoveryClient;

    @Override
    public void run(String... args) throws Exception {
        //打印发现客户端的描述
        logger.info("客户端信息start-->："+discoveryClient.description());
        discoveryClient.getInstances("restaurant-service").forEach(
                (ServiceInstance serviceInstance) -> {
                    logger.info(new StringBuilder("Instance -->" ).append(serviceInstance.getServiceId())
                    .append("\nServer:").append(serviceInstance.getHost()).append(":").append(serviceInstance.getPort())
                    .append("\nURI:").append(serviceInstance.getUri()).append("\n\n\n"));
                }
        );
        logger.info("客户端信息end<--");
    }
}
