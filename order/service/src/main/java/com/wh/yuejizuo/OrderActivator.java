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
//@EnableAspectJAutoProxy(exposeProxy = true)
//@EnableFeignClients
//@ComponentScan(value = { "com.wh.wincore.**",
//        "com.wh.yuejizuo.**" ,
//        "com.winhong.wincore.rest.register",
//        "com.wh.cloudos.**"})
//@RegisterReflectionForBinding(value = {LogFactory.class, HikariConfig.class})
public class OrderActivator {

    private static Logger log = LoggerFactory.getLogger(OrderActivator.class);

    public static void main(String[] args) {
        SpringApplication.run(OrderActivator.class, args);
        log.info("Order service has been started...");
    }

}
