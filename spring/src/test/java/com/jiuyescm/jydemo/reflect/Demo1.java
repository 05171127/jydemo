package com.jiuyescm.jydemo.reflect;

public class Demo1 {
    public static void main(String[] args) throws Exception{
        String className = "com.jiuyescm.jydemo.reflect.Demo";
        Class clazz = Class.forName(className);
        Demo demo = (Demo) clazz.newInstance();
        System.out.println(demo);
    }
}
