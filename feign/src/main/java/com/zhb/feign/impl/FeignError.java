package com.zhb.feign.impl;

import com.zhb.entity.Student;
import com.zhb.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author: 大冰
 * @Date: 2020/6/20 10:28
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "信息加载失败、、、、、、";
    }
}
