/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.demo.other01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test3 {
    public static void receive(int a){
        a = 100;
    }
    public static void main(String[] args) {
        int b = 1;
        receive(b);
        System.out.println("b = " + b);
    }
}
