/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.beike02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *开学了，学生开始到学校报道。
作为学校方，必须要清楚哪些学生来了，哪些学生没来。男生来了多少，女生来了多少。大一的学生来了多少，大二的有多少。
面对这样的需求，你该如何设计？
下面演示 面向过程的设计
 * @author 陈老师 现代管理学院
 */
public class App {
    public static void main(String[] args) throws IOException {
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("张三","女", "大一"));
        students.add(new Student("李四","男", "大二"));
        students.add(new Student("王五","女", "大一"));
        students.add(new Student("赵六","男", "大三"));
        students.add(new Student("孙七","女", "大一"));
        students.add(new Student("周八","男", "大一"));
        
        String[] comeon = {"张三","王五","赵六","周八"};//这些是来了的同学名单。
        for (int i = 0; i < comeon.length; i++) {
            String name = comeon[i];
            for(Student stu : students){
                if(stu.getName().equals(name)){
                    stu.setStatus("已报到");
                }
            }
        }
        System.out.println("男生报到人数：");
        int sex1,sex2,da1,da2,da3;
        sex1=sex2=da1=da2=da3=0;
        for(Student stu : students){
            if(stu.getSex().equals("男")){
                sex1++;
            }else{
                sex2++;
            }
            if(stu.getGrade().equals("大一")){
                da1++;
            }
        }
        System.out.println("以上过程代码冗长，不便于阅读，也不符合面向对象的思维。");
    }
}
