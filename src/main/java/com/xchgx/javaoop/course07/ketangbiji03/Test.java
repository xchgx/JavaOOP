/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji03;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Parent parent;//可以创建引用（变量）
//        parent = new Parent();//不能实例化抽象类
        Child child = new Child();//实例化子类对象
        parent = child;//抽象类的引用可以指向子类的对象
        parent = new Child();
        //a=b,b=c,==> a=c
        Parent parent1 = new Child();
        
    }
}
