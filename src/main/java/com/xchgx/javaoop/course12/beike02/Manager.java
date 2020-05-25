/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.beike02;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Manager {
    private ArrayList<Student> students;

    public Manager(ArrayList<Student> students) {
        this.students = students;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    } 
    /**
     * 报到
     * @param name 学生姓名
     */
    public void baodao(String name){
        for(Student stu : students){
            if(stu.getName().equals(name)){
                stu.setStatus("已报到");
            }
        }
    }
    /**
     * 统计性别人数
     * @param sex 男、女
     * @return 该性别的人数
     */
    public int countSex(String sex){
        int count = 0;
        for(Student stu : students){
            if(stu.getSex().equals(sex)){
                count ++ ;
            }
        }
        return count;
    }
    /**
     * 统计年级人数，传入年级参数
     * @param grade 大一、大二、大三
     * @return 该年级人数
     */
    public int countGrade(String grade){
        int count = 0;
        for(Student stu : students){
            if(stu.getGrade().equals(grade)){
                count ++ ;
            }
        }
        return count;
    }
    /**
     * 统计报到状态（已报到、未报到）
     * @param status 提供报到状态参数
     * @return 该报到状态的人数
     */
    public int countStatus(String status){
        int count = 0;
        for(Student stu : students){
            if(stu.getStatus().equals(status)){
                count ++ ;
            }
        }
        return count;
    }
}
