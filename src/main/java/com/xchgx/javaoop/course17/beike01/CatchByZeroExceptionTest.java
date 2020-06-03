/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.beike01;

/**
 * 捕获除数为0 的异常
 * @author 陈老师 现代管理学院
 */
public class CatchByZeroExceptionTest {
    public static void main(String[] args) { 
        try {
            int n = 5 / 0;//这里发现异常，直接抛出异常。
            System.out.println("n = " + n);//这行代码未执行
        } catch (Exception e) {//异常被抓获
            System.out.println("捕获到异常："+e);//输出异常信息
        }
        System.out.println("test end");//这条代码在正常执行。
    }
}
