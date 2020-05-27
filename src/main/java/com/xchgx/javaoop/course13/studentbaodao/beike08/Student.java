/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.studentbaodao.beike08;


/**
 *
 * @author 陈老师 现代管理学院
 */
public class Student {
    private String name;//姓名
    private String status = "未报到";//报到状态
    private String grade;//年级
    private String sex;//性别

    public Student(String name, String grade, String sex) {
        this.name = name;
        this.grade = grade;
        this.sex = sex;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
