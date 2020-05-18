/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike04;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class Zhengfangxing {//正方形类

    private double bianchang;//边长 

    public Zhengfangxing(double bianchang) {//构造方法
        this.bianchang = bianchang;
    }

    public double calcArea() {//求面积
        return bianchang * bianchang;
    }
}
