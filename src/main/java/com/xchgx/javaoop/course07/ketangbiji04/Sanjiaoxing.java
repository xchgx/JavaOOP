/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji04;

/**
 *
 * @author Administrator
 */
public class Sanjiaoxing {
    private double di;//底
    private double gao;//高
    public double calcArea(){//求面积
        return di*gao/2;
    }
    //下面的代码不用手写。

    public Sanjiaoxing(double di, double gao) {
        this.di = di;
        this.gao = gao;
    }

    public Sanjiaoxing() {
    }

    public double getDi() {
        return di;
    }

    public void setDi(double di) {
        this.di = di;
    }

    public double getGao() {
        return gao;
    }

    public void setGao(double gao) {
        this.gao = gao;
    }
    
}
