package com.jiuyescm.jydemo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MethodDemo {
    public static void main(String[] args) throws Exception{
        String className= "com.jiuyescm.jydemo.reflect.Demo";
        Class clazz = Class.forName(className);
        Constructor constructor = clazz.getConstructor(String.class,Integer.class);
        Demo demo = (Demo) constructor.newInstance("hello",200);
        Method method = clazz.getMethod("toString");
        String result = (String) method.invoke(demo);
        System.out.println(result);
    }
}
