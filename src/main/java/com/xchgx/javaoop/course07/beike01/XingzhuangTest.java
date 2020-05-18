/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike01;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class XingzhuangTest {
    public static void main(String[] args) {
        Xingzhuang xz1 = new Sanjiaoxing(4, 5);
        Xingzhuang xz2 = new Zhengfangxing(4);
        System.out.println(xz1.getName()+"的面积是"+xz1.clacArea());
        System.out.println(xz2.getName()+"的面积是"+xz2.clacArea());
        
    }
}
