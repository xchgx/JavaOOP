/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class StudentTest {
    public static void main(String[] args) {//主方法
        //Student类没有创建show()方法
        Student student = new Student();//创建的是学生对象
        student.setName("张三");//设置学生姓名
        student.setSex("男");//设置学生性别
        student.setAge(18);//设置学生年龄
        student.setSno("20192011201");//设置学生学号
        student.setDepartment("现代管理学院");//设置学生院系
        student.show();//此时，show()方法只在Person类中，Student类没有show()方法
        //经过了重写之后，此时student.show()方法将会调用自己的show()而不是父类
    }
}
