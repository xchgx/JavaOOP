/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike01;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class Zhengfangxing extends  Xingzhuang{
    private double bianchang;//边长

    public Zhengfangxing(double bianchang) {
        super("正方向");
        this.bianchang = bianchang;
    }
    
    @Override
    public double clacArea() {
        return bianchang*bianchang;                
    }
}
