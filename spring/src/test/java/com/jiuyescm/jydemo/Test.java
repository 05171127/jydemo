package com.jiuyescm.jydemo;

import com.jiuyescm.jydemo.propertycopy.UserEntity;
import com.jiuyescm.jydemo.propertycopy.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StopWatch;

public class Test {

    @org.junit.Test
    public void test1(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("张三");
        userEntity.setAge(18);
        UserVo userVo  =new UserVo();
        BeanUtils.copyProperties(userEntity,userVo);
        System.out.println(userVo);
    }

    @org.junit.Test
    public void test2(){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("张三");
        userEntity.setAge(18);
        UserVo userVo  =new UserVo();
        BeanUtils.copyProperties(userEntity,userVo,"id");
        System.out.println(userVo);
    }

    @org.junit.Test
    public void test3() throws InterruptedException{
        long start  = System.currentTimeMillis();
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        System.out.println("执行耗时:" + (end - start));
    }

    @org.junit.Test
    public void test4() throws InterruptedException{
        StopWatch watch = new StopWatch();
        watch.start();
        Thread.sleep(100);
        watch.stop();
        System.out.println("执行耗时:"+watch.getTotalTimeMillis());
    }
}
