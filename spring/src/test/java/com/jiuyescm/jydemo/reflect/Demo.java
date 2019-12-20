package com.jiuyescm.jydemo.reflect;

import java.lang.reflect.Field;

public class Demo {
    private String value;
    private Integer num;
    public Demo() {
    }
    public Demo(String value, Integer num) {
        this.value = value;
        this.num = num;
    }
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "value='" + value + '\'' +
                ", num=" + num +
                '}';
    }

    public void setValue(String value) {
        this.value = value;
    }
    public Integer getNum() {
        return num;
    }
    public void setNum(Integer num) {
        this.num = num;
    }

    public static void main(String[] args) throws Exception{
        String className = "com.jiuyescm.jydemo.reflect.Demo";
        Class clazz = Class.forName(className);
        Demo demo = new Demo("zhangSan", 123);
        Field field1 = clazz.getDeclaredField("value");
        Field field2 = clazz.getDeclaredField("num");
        String value = (String)field1.get(demo);
        Integer num = (Integer)field2.get(demo);
        System.out.println(value + ", " + num);
        field1.set(demo, "liSi");
        field2.set(demo, 456);
        System.out.println(demo);

    }
}
