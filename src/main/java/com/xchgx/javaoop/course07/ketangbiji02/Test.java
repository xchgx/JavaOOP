/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji02;

/**
 *
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();//这里没有问题，可以new（实例化）
//        Parent parent = new Parent();//抽象类无法实例化
//        Parent parent = new Parent() {
//            @Override
//            public void say() {
//            }
//        };
    }
}
