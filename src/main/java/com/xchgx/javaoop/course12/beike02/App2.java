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
public class App2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三","女", "大一"));
        students.add(new Student("李四","男", "大二"));
        students.add(new Student("王五","女", "大一"));
        students.add(new Student("赵六","男", "大三"));
        students.add(new Student("孙七","女", "大一"));
        students.add(new Student("周八","男", "大一"));
        
        Manager manager = new Manager(students);
        String[] comeon = {"张三","王五","赵六","周八"};//这些是来了的同学名单。
        for (int i = 0; i < comeon.length; i++) {
            manager.baodao(comeon[i]);
        }
        System.out.println("大一 "+manager.countGrade("大一"));
        System.out.println("大二 "+manager.countGrade("大二"));
        System.out.println("大三 "+manager.countGrade("大三"));

        System.out.println("男 "+manager.countSex("男"));
        System.out.println("女 "+manager.countSex("女"));

        System.out.println("未报到 "+manager.countStatus("未报到")); 
        System.out.println("已报到 "+manager.countStatus("已报到")); 
    }
}
