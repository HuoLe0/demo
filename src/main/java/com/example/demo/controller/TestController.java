package com.example.demo.controller;

import com.example.demo.entity.Students;
import com.example.demo.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController

public class TestController {
    @Autowired
    private StudentsRepository studentsRepository;
    @GetMapping("/students/insert")
    public void insert(){

        Students students1 = new Students();
        students1.setName("好基友1");
        students1.setGender("male");
        students1.setFee(new BigDecimal(1200.01));
        studentsRepository.save(students1);

        Students students2 = new Students();
        students2.setName("好基友2");
        students2.setGender("male");
        students2.setFee(new BigDecimal(12000000000.01));
        studentsRepository.save(students2);
    }

}
