/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course01.demo;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Calc {
    private int a;
    private int b;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    } 
    
    public int add(){
        int c = a+b;
        System.out.println(a+"+"+b+"="+c);
        return c;
    }
    public int sub(){
        int c = a-b;
        System.out.println(a+"-"+b+"="+c); 
        return c;
    }
    public double mul(){
        double c = a*b;
        System.out.println(a+"×"+b+"="+c); 
        return c;
    }
    public double div(){
        double c = a*1.0/b;
        System.out.println(a+"÷"+b+"="+c); 
        return c;
    } 
    
}
