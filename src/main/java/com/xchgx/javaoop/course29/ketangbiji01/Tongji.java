/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course29.ketangbiji01;

import java.util.ArrayList;

/**
 * 统计算法
 *
 * @author 陈老师 现代管理学院
 */
public class Tongji {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> findedStudent = new ArrayList<>();//Ctrl+Shift+下(Down)
        students.add(new Student("张三", 18));
        students.add(new Student("李四", 19));
        students.add(new Student("王五", 20));
        students.add(new Student("赵六", 22));
        //统计20岁（含）以上的学生
        for (Student stu : students) {//如果不修改元素的情况下，通常使用for..in
            if (stu.age >= 20) {
                findedStudent.add(stu);
                //不要break退出循环，因为我们要查找多个人
            }
        }
        for (Student stu : findedStudent) {//这回遍历的是符合条件的学生
            System.out.println(stu.name + " : " + stu.age);
        }
    }
}

class Student {
    public String name;
    public int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
