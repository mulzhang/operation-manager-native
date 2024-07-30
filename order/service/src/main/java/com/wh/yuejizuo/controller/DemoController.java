package com.wh.yuejizuo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DemoController {


//    private final DemoService demoService;
//    private final ConfigService config;

    @GetMapping("/all")
    public Object get() {
//        List<Demo> all = demoService.getAll();
//        all.add(Demo.builder()
//                        .name(Integer.valueOf(config.getName()))
//                        .age(4151515L)
//                .build());
        return "1111111";
    }
}
