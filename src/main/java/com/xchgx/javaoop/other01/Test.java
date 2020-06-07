/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.other01;

/**
 * 
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void receive1(int a){
        a = 111;
    }
    public static void receive2(int b[]){
        b[0] = 11;
    } 
    public static void main(String[] args) {//主方法
        System.out.println("Hello World!");
        int a = 10;
        int b[] = {1,2};
        System.out.println("修改前 a = " + a);
        receive1(a);
        System.out.println("修改后 a = " + a);
        
        System.out.println("修改前 b[0] = " + b[0]);
        receive2(b);
        System.out.println("修改后 b[0] = " + b[0]);  
    }
}
enum Day{
    MON,TUE,WED
}