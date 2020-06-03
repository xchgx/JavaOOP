/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.beike01;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class FinallyTest {
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
        } catch (InputMismatchException e) {
            System.out.println("输入的内容不是数字！请重试。");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0，请重试。");
        }catch(Exception e){
            System.out.println("捕获到未处理的异常信息："+e);
        }finally{
            System.out.println("end of finally 无论如何我都会执行");
        }
        System.out.println("end of main");
    }
}
