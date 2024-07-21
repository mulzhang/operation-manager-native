package com.wh.yuejizuo.controller;

import com.wh.yuejizuo.domain.Demo;
import com.wh.yuejizuo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DemoController {


    private final DemoService demoService;

    @Value("${name}")
    private Integer name;

    @GetMapping("/all")
    public Object get() {
        List<Demo> all = demoService.getAll();
        all.add(Demo.builder()
                        .name(name)
                        .age(4151515L)
                .build());
        return name;
    }
}
