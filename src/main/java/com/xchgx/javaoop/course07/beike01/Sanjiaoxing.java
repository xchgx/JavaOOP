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
public class Sanjiaoxing extends Xingzhuang{//三角形
    private double di;//底
    private double gao;//高
    public Sanjiaoxing(double di, double gao) {
        super("三角形");
        this.di = di;
        this.gao = gao;
    }

    @Override
    public double clacArea() {
        return di*gao/2;
    }
    
}
