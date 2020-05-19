/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji05;

/**
 * 形状抽象类
 * @author Administrator
 */
public abstract class Xingzhuang {//形状抽象类
    private String name;//形状的名称
    public abstract double calcArea();//求面积 抽象方法表明了子类一定要实现该方法
}
