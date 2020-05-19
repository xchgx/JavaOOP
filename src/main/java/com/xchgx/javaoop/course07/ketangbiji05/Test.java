/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji05;

/**
 * 测试形状抽象类
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {//主方法
        Xingzhuang xz = new Sjx(4, 5);//抽象类的引用指向子类的对象
        System.out.println("xz.calcArea() = " + xz.calcArea()); 
    }
}
