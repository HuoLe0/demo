package com.example.demo.service;

import com.example.demo.holder.CurrentUserHolder;
import org.springframework.stereotype.Service;

@Service
public class CheckStudentService {

    public void check() throws Exception{
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)){
            throw new Exception ("【异常】你不是管理员！");
        }
    }
}
