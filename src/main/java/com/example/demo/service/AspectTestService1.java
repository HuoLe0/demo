package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AspectTestService1 {

//    @Autowired
//    private CheckStudentService checkStudentService;


    public void insert() throws Exception{
        System.out.println("AspectTestService1增添加记录成功！");
//        throw new Exception("人为抛出异常");
    }


    public void delete(){
        System.out.println("AspectTestService1删除记录成功！");
    }


    public void update(){
        System.out.println("AspectTestService1更新记录成功！");
    }


    public void find(){
        System.out.println("AspectTestService1查询成功！");
    }
}
