/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.ketangbiji03;

/**
 * 学生类
 * @author 陈老师 现代管理学院
 */
public class Student {
    private String name;//姓名
    private  String sex;//性别
    private String grade; //年级
    private String status;//报到状态

    public Student(String name, String sex, String grade) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
