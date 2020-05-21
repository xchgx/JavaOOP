/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.beike;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Sanjiaoxing {//三角形
    private double a;
    private double b;
    private double c;

    public Sanjiaoxing(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double jsZhouchang(){//计算三角形的周长
        return a+b+c;
    }
    
    public double  jsMianji(){ // 计算面积
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    } 
}
