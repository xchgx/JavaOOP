/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.example02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Zhengfangxing {//正方形
    private double a;//边长

    public   Zhengfangxing(double a) {//带参数的构造器
        this.a = a;
    }
    
    public double jsZhouchang(){
        return a*4;//四边一样长4*a
    }
    public double jsMianji(){
        return Math.pow(a, 2);//a*a
    }
    
}
