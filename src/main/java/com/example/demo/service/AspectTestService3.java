package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class AspectTestService3 {

    public void insert(){
        System.out.println("AspectTestService3增添加记录成功！");
    }


    public void delete(){
        System.out.println("AspectTestService3删除记录成功！");
    }


    public void update(){
        System.out.println("AspectTestService3更新记录成功！");
    }


    public void find(){
        System.out.println("AspectTestService3查询成功！");
    }
}
