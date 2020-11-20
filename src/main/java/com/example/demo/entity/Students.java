package com.example.demo.entity;

import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity //实体类
public class Students {

    @Id
    @GeneratedValue
    private Integer id;//学号

    @NotNull(message = "姓名不能为空")
    private String name;//姓名

    private String major;//专业
    private String banji;//班级

    @NotNull(message = "电话不能为空")
    private String phone;//电话
    private String propose1;//志愿1
    private String propose2;//志愿2
    private String reason;//理由
    private String gender;//性别
    private BigDecimal fee;//学费

    public String getMessage(MethodArgumentNotValidException exception){
        String message = exception.getBindingResult().getFieldError().getDefaultMessage();
        return message;
    }

    public Students() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPropose1() {
        return propose1;
    }

    public void setPropose1(String propose1) {
        this.propose1 = propose1;
    }

    public String getPropose2() {
        return propose2;
    }

    public void setPropose2(String propose2) {
        this.propose2 = propose2;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
