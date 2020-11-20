package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AspectTestService2 {

    public void insert(){
        System.out.println("AspectTestService2增添加记录成功！");
    }


    public void delete(){
        System.out.println("AspectTestService2删除记录成功！");
    }


    public void update(){
        System.out.println("AspectTestService2更新记录成功！");
    }


    public void find(){
        System.out.println("AspectTestService2查询成功！");
    }
}
