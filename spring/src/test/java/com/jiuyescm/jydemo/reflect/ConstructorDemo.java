package com.jiuyescm.jydemo.reflect;

import java.lang.reflect.Constructor;

public class ConstructorDemo {
    public static void main(String[] args) throws Exception{
        String className = "com.jiuyescm.jydemo.reflect.Demo";
        Class clazz = Class.forName(className);
        Constructor c = clazz.getConstructor(String.class,Integer.class);
        Demo demo = (Demo) c.newInstance("hello",100);
        System.out.println(demo.getValue());
    }
}
