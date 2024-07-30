package com.wh.yuejizuo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * OrderService
 *
 * @author Administrator
 */
@SpringBootApplication
public class OrderActivator {

    private static Logger log = LoggerFactory.getLogger(OrderActivator.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderActivator.class, args);
        log.info("Order service has been started...");
    }

}
