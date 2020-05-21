/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.beike;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class TixingTest {//梯形类测试

    public static void main(String[] args) {//主方法
        Tixing zfx = new Tixing(2,4,5);//传入梯形的上底=2，下底=4，高=5；三个参数

        double jsMianji = zfx.jsMianji();//计算面积
        if (jsMianji != 15) {
            System.out.println("计算面积出错:"+jsMianji);
        } else {
            System.out.println("jsMianji = " + jsMianji);
        }
    }
}
