/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.studentbaodao.beike04;

/**
 * 学生报到统计 主程序启动类
 * @author 陈老师 现代管理学院
 * @version 2.0 2020-5-26 23:55:10 
 */
public class App {
    public static void main(String[] args) {
        String[] names = {"张三","李四","王五","赵六"};//今天来报到的人。
        //这里应该使用学号，因为学号是唯一的，名字有可能有重名。
        //但是学号不方便查看阅读，这里我们假设姓名没有重复的。
        for(int i=0; i<names.length; i++){
            names[i]+="√";
        }
        
        for(String name : names){
            System.out.println("name = " + name);
        }
        //这里只能解决来报到的学生，那些没有来报到的人呢？
        //所以，这里要有一张全校的学生名单。
        //见下一个版本
        
    }
}
