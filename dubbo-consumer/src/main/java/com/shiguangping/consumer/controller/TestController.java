package com.shiguangping.consumer.controller;

import com.shiguangping.api.ITestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyan
 */
@RestController
@RequestMapping("test")
public class TestController {

    @DubboReference(group = "test", version = "1.0.0", timeout = 6000)
    private ITestService iTestService;

    @GetMapping("test")
    public String test(String str){
        String test = iTestService.test(str);
        return test;
    }
}
