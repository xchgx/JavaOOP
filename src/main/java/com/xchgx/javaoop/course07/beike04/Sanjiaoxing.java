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
public class Sanjiaoxing {
    private double di;//底
    private double gao;//高

    public Sanjiaoxing() {
    }

    public Sanjiaoxing(double di, double gao) {
        this.di = di;
        this.gao = gao;
    }
    public double calcArea(){//求面积
        return  di*gao/2;
    }
}
