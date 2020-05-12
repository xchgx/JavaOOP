/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.beike;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Changfangxing {

    private int a;
    private int b;

    public Changfangxing(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double jsZhouchang() {//计算周长
        return 2 * (a + b);
    }

    public double jsMianji() { // 计算面积
        return a * b;
    }

}



