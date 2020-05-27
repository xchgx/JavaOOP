/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course13.studentbaodao.beike06;

import java.util.ArrayList;

/**
 *
 * 学生报到统计 主程序启动类
 *
 * @author 陈老师 现代管理学院
 * @version 4.0 2020年5月27日10:25:01
 */
public class App {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        //这里初始化一个示例数据，作为我们的全校学生
        students.add(new Student("刘一"));
        students.add(new Student("陈二"));
        students.add(new Student("张三"));
        students.add(new Student("李四"));
        students.add(new Student("王五"));
        students.add(new Student("赵六"));
        students.add(new Student("孙七"));
        students.add(new Student("周八"));
        students.add(new Student("吴九"));
        students.add(new Student("郑十"));
        //名单初始化完毕，接下来模拟报到。
        String[] baodaoname = {"张三", "李四", "王五"};
        for (int i = 0; i < baodaoname.length; i++) {
            String bdname = baodaoname[i];//依次拿出报到学生姓名
            for (Student stu : students) {//遍历学生名单集合
                if (stu.getName().equals(bdname)) {//从学生名单中找到该学生
                    stu.setStatus("已报到");//设置该学生的状态为 已报到
                }
            }
        }
        //输出统计结果
        for (Student stu : students) {//遍历学生名单集合
            System.out.println("姓名："+stu.getName()+","+stu.getStatus());
        }
    }
}

class Student {

    private String name;//姓名
    private String status = "未报到";//报到状态

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String status) {
        this.name = name;
        this.status = status;
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
