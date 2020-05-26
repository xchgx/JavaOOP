/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Student {
    private String name; //姓名
    private Integer count=1;//发言次数

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
    public void jj(){
        this.count++;
    }
}
