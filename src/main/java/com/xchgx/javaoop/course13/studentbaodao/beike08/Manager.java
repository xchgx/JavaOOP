/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course13.studentbaodao.beike08;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Manager {//专门管理学生名单和报到手续的类

    private ArrayList<Student> students;

    /**
     * 获得输出
     *
     * @return 格式化后的字符串
     */
    public String show() {
        String result = "";
        for (Student stu : students) {
            result += stu.getName() + "," + stu.getStatus() + "," + stu.getSex() + "," + stu.getGrade() + "\n";
        }
        return result;
    }

    /**
     * 给定年级输出
     *
     * @return 格式化后的字符串
     */
    public String showGrade(String grade) {
        String result = "";
        for (Student stu : students) {
            if (stu.getGrade().equals(grade)) {
                result += stu.getName() + "," + stu.getStatus() + "," + stu.getSex() + "," + stu.getGrade() + "\n";
            }
        }
        return result;
    }

    /**
     * 单个学生报到
     *
     * @param name 学生姓名
     */
    public void baodao(String name) {
        for (Student stu : students) {//遍历学生名单集合
            if (stu.getName().equals(name)) {//从学生名单中找到该学生
                stu.setStatus("已报到");//设置该学生的状态为 已报到
            }
        }
    }

    /**
     * 批量报到
     *
     * @param names 学生数组
     */
    public void baodao(String[] names) {
        for (int i = 0; i < names.length; i++) {
            String bdname = names[i];//依次拿出报到学生姓名
            baodao(bdname);
        }
    }

    public Manager(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

}
