package com.jiuyescm.jydemo.service.impl;

import com.jiuyescm.jydemo.service.DemoService;


public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        int a = 3/0;
        return "Hello " + name;
    }
}
