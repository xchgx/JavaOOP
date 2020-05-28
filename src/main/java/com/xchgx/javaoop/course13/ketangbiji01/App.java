/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.ketangbiji01;

/**
 * 学生报到程序
 * @version 1.0 2020-5-28 09:25:00
 * @author 陈老师 现代管理学院
 */
public class App {
    public static void main(String[] args) {//主方法
        System.out.println("欢迎来到学生报到统计程序..");
        //如何编写报到统计程序呢？
        //模拟一个来报到的学生
        String name = "张三";
        //模拟这个学生报到的过程
        name+="√";
        //输出报到人员信息
        System.out.println("name = " + name);
        
        String name2 = "李四";
        System.out.println("name2 = " + name2);
        
        String name3 = "王五";
        name3+="√";
        System.out.println("name3 = " + name3);
    }
}
