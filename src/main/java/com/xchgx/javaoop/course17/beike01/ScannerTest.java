/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course17.beike01;

import java.util.Scanner;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ScannerTest {

    public static void main(String[] args) {
        //创建Scanner对象，接收控制台的输入
        Scanner s = new Scanner(System.in);//创建扫描器对象，并设置输入流来自控制台（System.in）
        try {
            System.out.print("请输出第一个数：");
            int x = s.nextInt();//从命令行读取一个整数
            System.out.println("x = " + x);//打印输出x的值
            System.out.print("请输出第二个数：");
            int y = s.nextInt(); //再次从命令行读取一个整数
            System.out.println("y = " + y);//打印y的值
            int m = x / y;//将两个数相除，结果保存在m变量中。
            System.out.println("m = " + m);//打印m的值
            System.out.println("end of try");
        } catch (Exception e) {
            System.out.println("捕获到异常信息："+e);
            e.printStackTrace();//打印异常堆栈信息
            System.out.println("end of catch");
        }
        System.out.println("end of main");
    }
}
