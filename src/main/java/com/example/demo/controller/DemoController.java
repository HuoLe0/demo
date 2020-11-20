package com.example.demo.controller;

import com.example.demo.config.TodoListConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController //Controller + ResponseBody = RestController

public class DemoController {
    @Autowired
    private TodoListConfig todoListConfig;

    @Value("${todo.date}")
    private String date;

    @GetMapping("")
    public String say(){
        return "啥玩意儿啊！";
    }

    @PostMapping({"/demo"})
    public String think(@RequestParam(value = "key") String key){
        return todoListConfig.getThing()+key;
    }

    @GetMapping("/demo1/{key}")
    public String think1(@PathVariable("key") String key){
        return key;
    }
}
