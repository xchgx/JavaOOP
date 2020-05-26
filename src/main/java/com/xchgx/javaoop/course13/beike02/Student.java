/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.beike02;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Student {
    private String name; //姓名
    private Integer count=0;//发言次数
    private ArrayList<String> logStart = new ArrayList<>();//留言开始
    private ArrayList<String> logContent = new ArrayList<>(); //留言内容

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

    public ArrayList<String> getLogStart() {
        return logStart;
    }

    public void setLogStart(ArrayList<String> logStart) {
        this.logStart = logStart;
    }

    public ArrayList<String> getLogContent() {
        return logContent;
    }

    public void setLogContent(ArrayList<String> logContent) {
        this.logContent = logContent;
    }
   
    
    public void jj(){
        this.count++;
    }
    
}
