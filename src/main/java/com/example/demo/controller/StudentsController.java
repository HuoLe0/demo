package com.example.demo.controller;

import com.example.demo.entity.Students;
import com.example.demo.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentsController {

    @Autowired
    private StudentsRepository studentsRepository;



    /**
     * 获取学生所有信息
     */
    @GetMapping("/students")
    public List<Students> getAll(){
        return studentsRepository.findAll();
    }

    /**
     * 创建学生信息
     */
    @PostMapping("/students")
    public Students create(@RequestParam("name")String name,
                           @RequestParam("gender")String gender,
                           @RequestParam("fee")BigDecimal fee,
                           @RequestParam("major") String major,
                           @RequestParam("banji") String banji,
                           @RequestParam("phone") String phone,
                           @RequestParam("propose1") String propose1,
                           @RequestParam("propose2") String propose2,
                           @RequestParam("reason") String reason){
        Students students = new Students();
        students.setName(name);
        students.setGender(gender);
        students.setFee(fee);
        students.setMajor(major);
        students.setBanji(banji);
        students.setPhone(phone);
        students.setPropose1(propose1);
        students.setPropose2(propose2);
        students.setReason(reason);
        return studentsRepository.save(students);
    }

    /**
     * 通过学号查询学生信息
     */
    @GetMapping("/students/{id}")
    public Students getById(@PathVariable("id") Integer id){
        return studentsRepository.findById(id).orElse(null);
    }

    /**
     * 通过学号更新 学生信息
     */
    @PutMapping("/students/{id}")
    public Students update(@PathVariable("id") Integer id,
                           @RequestParam("name")String name,
                           @RequestParam(value = "gender",required = false)String gender,
                           @RequestParam(value = "fee",required = false)BigDecimal fee,
                           @RequestParam(value = "major",required = false) String major,
                           @RequestParam(value = "banji",required = false) String banji,
                           @RequestParam(value = "phone",required = false) String phone,
                           @RequestParam(value = "propose1",required = false) String propose1,
                           @RequestParam(value = "propose2",required = false) String propose2,
                           @RequestParam(value = "reason",required = false) String reason){
        Optional<Students> optionalStudents = studentsRepository.findById(id);
        Students students;
        students = optionalStudents.orElse(null);
        students.setName(name);
        students.setGender(gender);
        students.setFee(fee);
        students.setMajor(major);
        students.setBanji(banji);
        students.setPhone(phone);
        students.setPropose1(propose1);
        students.setPropose2(propose2);
        students.setReason(reason);
        return studentsRepository.save(students);
    }

    /**
     * 删除学生信息
     */
    @DeleteMapping("students/{id}")
    public String delete(@PathVariable("id") Integer id){


        studentsRepository.deleteById(id);
        return "删除成功！";

    }

    /**
     * insert
     */
    @GetMapping("students/insert1")
    public Students insert1(@RequestParam("name") String name,
                            @RequestParam("phone") String phone){
        Students students = new Students();
        students.setName(name);
        students.setPhone(phone);
        return studentsRepository.save(students);

    }
}
