/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji05;

/**
 * 三角形形状
 * @author Administrator
 */
public class Sjx extends Xingzhuang{//从形状中继承
    private double di;//底
    private double gao;//高
    @Override//重写、覆盖、实现父类方法
    public double calcArea() {//实现父类中的抽象方法——计算面积
        //底×高÷2
        return di*gao/2;
    }
    //下面的带来来自于 插入代码
    //构造器（默认、全参数）

    public Sjx() {
    }
    public Sjx(double di, double gao) {
        this.di = di;
        this.gao = gao;
    }
    
    //属性的getter和setter

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
