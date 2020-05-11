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
public class Zhengfangxing {
    private int a ;

    public Zhengfangxing(int a) {
        this.a = a;
    }
    
    public double jsZhouchang(){
        return a*4;
    }
    public double jsMianji(){
        return Math.pow(a, 2);
    }
    
}
