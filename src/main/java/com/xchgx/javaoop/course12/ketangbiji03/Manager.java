/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.ketangbiji03;

import java.util.ArrayList;

/**
 * 学生管理类
 * @author 陈老师 现代管理学院
 */
public class Manager {
    private ArrayList<Student> students;//不要new，不要分配内存，不要初始化

    public Manager(ArrayList<Student> students) {//这个构造器，一定要传入学生集合
        this.students = students;
    }
    
    /**
     * 统计状态人数
     * @param status 传入指定的状态
     * @return 
     */
    public int countStatus(String status){
        int count = 0;
        for(Student stu : students){//for in循环
            if(stu.getStatus().equals(status)){
                count++;
            }
        }
        return  count;
    }
    
    
}
