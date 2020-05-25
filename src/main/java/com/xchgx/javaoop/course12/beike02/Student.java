/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.beike02;

/**
 *
 * 开学了，学生开始到学校报道。
作为学校方，必须要清楚哪些学生来了，哪些学生没来。男生来了多少，女生来了多少。大一的学生来了多少，大二的有多少。
面对这样的需求，你该如何设计？

 * @author 陈老师 现代管理学院
 */
public class Student {
    private String name;//学生姓名
    private String sex;//性别
    private String grade;//1：大一  2：大二   3：大三
    private String status = "未报到";//报道状态

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
