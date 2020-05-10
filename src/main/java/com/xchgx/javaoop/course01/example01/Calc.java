/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course01.example01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Calc{
    private int a;
    private int b;
 
    
    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
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
