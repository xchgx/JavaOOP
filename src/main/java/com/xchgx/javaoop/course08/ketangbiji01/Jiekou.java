/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.ketangbiji01;

/**
 *
 * @author Administrator
 */
public interface Jiekou {//相当于我们创建了一个规则，规范
//常量就是final修饰的变量。final修饰的变量一定要初始化
    public static final int YEAR=2020;
    public void say(); //接口的方法，不需要abstract
    public void listen(); //接口方法不要写方法体
//    public void ff(){}
}
