/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.ketangbiji04;

import java.util.ArrayList;

/**
 * 学生报到程序
 * @version 4.0 2020-5-28 10:22:55
 * @author 陈老师 现代管理学院
 */
public class App4 {
    public static void main(String[] args) {//主方法，程序入口
        ArrayList<Student> studentList = new ArrayList<>();//创建全班学生名单并实例化
        studentList.add(new Student("刘一"));//Student stu = new Student("张三");
        studentList.add(new Student("陈二"));
        studentList.add(new Student("张三"));
        studentList.add(new Student("李四"));
        studentList.add(new Student("王五"));
        studentList.add(new Student("赵六"));
        studentList.add(new Student("孙七"));
        studentList.add(new Student("周八"));
        studentList.add(new Student("吴九"));
        studentList.add(new Student("郑十"));
        //上面初始化完毕
        String[] paiduis = {"张三","李四","郑十"};//模拟排队报到的人员信息
        //执行报到程序
        for(String pdname : paiduis){//遍历排队报到的学生姓名数组
            for(Student stu : studentList){//这里也采用for in 语句
                if(stu.getName().equals(pdname)){//如果名单中的姓名和排队姓名相等
                    stu.setStatus("已报到");//为什么不用for i循环，因为stu变量是类类型，属于引用类型
                }
            }
        }
        //输出报到统计结果
        for(Student stu : studentList){//遍历全班学生名单
            System.out.println(stu.getName() + ":  "+stu.getStatus());//自己排版，格式化输出
        }//manager.show()
    }
}
