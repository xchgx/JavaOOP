/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String args[]){
        Bijiao bj = new Bijiao();
        int max1 = bj.max(1, 2);
        System.out.println("max1 = " + max1);
        int max2 = bj.max(3, 2);//int 整型数字比较
        System.out.println("max2 = " + max2);
        float max3 = bj.max(1.1f, 2.2f); //float 浮点类型数字边角
        System.out.println("max3 = " + max3);
        double max4 = bj.max(2.2, 3.3);//double类型数字比较
        System.out.println(max4==3.3?"ok":"出错");
    }
}
