package com.wh.yuejizuo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wh.yuejizuo.domain.Demo;
import com.wh.yuejizuo.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoService extends ServiceImpl<DemoMapper, Demo> {

    public List<Demo> getAll() {
        return super.lambdaQuery().list();
    }
}
