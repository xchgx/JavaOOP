/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.studentbaodao.beike08;

import java.util.ArrayList;

/**
 *
 * 学生报到统计 主程序启动类
 *
 * @author 陈老师 现代管理学院
 * @version 6.0 2020-5-27 10:44:45
 */
public class App {
       public static void main(String[] args) {
        
            ArrayList<Student> students = new ArrayList<>();
        //这里初始化一个示例数据，作为我们的全校学生
        students.add(new Student("刘一","大一","男"));
        students.add(new Student("陈二","大二","女"));
        students.add(new Student("张三","大三","男"));
        students.add(new Student("李四","大一","女"));
        students.add(new Student("王五","大二","男"));
        students.add(new Student("赵六","大一","女"));
        students.add(new Student("孙七","大三","女"));
        students.add(new Student("周八","大一","男"));
        students.add(new Student("吴九","大二","男"));
        students.add(new Student("郑十","大一","女"));
        Manager manager = new Manager(students);
        
        //名单初始化完毕，接下来模拟报到。
        String[] baodaoname = {"张三", "李四", "王五"};
        manager.baodao(baodaoname);
        System.out.println(manager.show());
        System.out.println(manager.showGrade("大一"));
        System.out.println(manager.showGrade("大二"));
        System.out.println(manager.showGrade("大三"));
    }
}
