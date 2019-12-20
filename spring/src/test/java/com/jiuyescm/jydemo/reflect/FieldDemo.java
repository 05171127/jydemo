package com.jiuyescm.jydemo.reflect;

import java.lang.reflect.Field;

public class FieldDemo {
    public static void main(String[] args) throws Exception{
        String className = "com.jiuyescm.jydemo.reflect.Demo";
        Class clazz = Class.forName(className);
        Demo demo = new Demo("zhangSan", 123);
        Field field1 = clazz.getDeclaredField("value");
        Field field2 = clazz.getDeclaredField("num");
        field1.setAccessible(true);
        field2.setAccessible(true);
        String value = (String)field1.get(demo);
        Integer num = (Integer)field2.get(demo);
        System.out.println(value + ", " + num);
        field1.set(demo, "liSi");
        field2.set(demo, 456);
        System.out.println(demo);
    }
}
