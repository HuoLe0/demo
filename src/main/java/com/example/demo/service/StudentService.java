package com.example.demo.service;

import com.example.demo.annotation.adminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private CheckStudentService checkStudentService;

    @adminOnly
    public void insert(){
        System.out.println("增添加记录成功！");
    }

    @adminOnly
    public void delete(){
        System.out.println("删除记录成功！");
    }

    @adminOnly
    public void update(){
        System.out.println("更新记录成功！");
    }

    @adminOnly
    public void find(){
        System.out.println("查询成功！");
    }
}
