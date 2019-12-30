package com.jiuyescm.jydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        /*User user = (User) applicationContext.getBean("user");
        System.out.println(user);*/
        System.out.println(applicationContext.getBean("beanA"));
        System.out.println(applicationContext.getBean("beanB"));
        System.out.println(applicationContext.getBean("beanC"));

    }
}
