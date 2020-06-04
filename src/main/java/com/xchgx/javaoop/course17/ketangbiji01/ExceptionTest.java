/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.ketangbiji01;

/**
 * 测试体验异常
 * @author 陈老师 现代管理学院
 */
public class ExceptionTest {
    public static void main(String[] args) {//主方法
        
        try{
           System.out.println("Hello,Let's begin.");//无异常
           int a = 5/0;
        }catch(Exception e){//捕获异常，如果捕获到了异常就
            //处理该异常
            System.out.println("你出错: 除数不能为0");
        }
        System.out.println("Over End");
        
        
    }
}
