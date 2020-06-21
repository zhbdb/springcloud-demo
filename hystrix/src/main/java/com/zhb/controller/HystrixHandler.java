package com.zhb.controller;

import com.zhb.entity.Student;
import com.zhb.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author: 大冰
 * @Date: 2020/6/20 11:31
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
       return feignProviderClient.findAll();
    }

}
