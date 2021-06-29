package com.shiguangping.provider.api.impl;

import com.shiguangping.api.ITestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author liyan
 */
@DubboService(group = "test", version = "1.0.0")
public class TestServiceImpl implements ITestService {
    @Override
    public String test(String s) {
        return "调用成功，我是服务提供者：" + s;
    }
}
