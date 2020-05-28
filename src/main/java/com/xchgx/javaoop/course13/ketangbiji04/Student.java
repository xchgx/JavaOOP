/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.ketangbiji04;

/**
 * 学生类
 * @author 陈老师 现代管理学院
 */
public class Student {
    //姓名
    private String name;//姓名
    //报到状态
    private  String status="未报到";//报到状态: 未报到（×）、已报到（√），默认值为 未报到
    
    //下面是IDE工具提供的插入代码自动生成的
    public Student(String name) {
        this.name = name;
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
    
}
