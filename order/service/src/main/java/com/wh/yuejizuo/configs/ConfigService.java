//package com.wh.yuejizuo.configs;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
//@Component
//@RefreshScope
//public class ConfigService {
//
//    private String name;
//
//    @Value("${name}")
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @EventListener
//    public void handleRefreshEvent(SomeConfigChangeEvent event) {
//        // 自定义配置刷新逻辑
//        setName(event.getNewName());
//    }
//}
