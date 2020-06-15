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
public class Test4 {
    public static void receive(int a[]){
        a[0] = 100;
    }
    public static void main(String[] args) {
        int b[] = {2,4,6,8};//创建数组类型变量b
        receive(b);//调用方法，传入数组
        System.out.println("b[0] = " + b[0]);//输出b[0] = 100
    }
}
