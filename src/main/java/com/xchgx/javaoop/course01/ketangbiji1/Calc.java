/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course01.ketangbiji1;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Calc {//计算器类
    private int a;//运算数1
    private int b;//运算数2
    public Calc(int n1, int n2){
        this.a = n1;
        this.b = n2;
    }
    public int add(){
        return a+b;
    }
    public int sub(){
        return a-b;
    }
    public long mul(){
        return a*b;
    }
    public double div(){
        return a*1.0/b;
    }
}














