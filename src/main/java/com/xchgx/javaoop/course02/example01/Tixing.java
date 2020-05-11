/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.example01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Tixing {//梯形类

    private double a;//上底
    private double b;//下底
    private double h;//高

    public Tixing(double a, double b, double h) {//构造方法
        this.a = a;//上底
        this.b = b;//下底
        this.h = h;//梯形的高
    }

    public double jsMianji() {//计算面积
        return (a+b)*h/2;//面积公式
    }
}
