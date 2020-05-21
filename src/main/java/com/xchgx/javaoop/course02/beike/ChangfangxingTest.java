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
public class ChangfangxingTest {

    public static void main(String[] args) {

        Changfangxing zfx = new Changfangxing(3,4);

        double jsZhouchang = zfx.jsZhouchang();
        if (jsZhouchang != 14) {
            System.out.println("计算周长出错");
        } else {
            System.out.println("jsZhouchang = " + jsZhouchang);
        }

        double jsMianji = zfx.jsMianji();
        if (jsMianji != 12) {
            System.out.println("计算面积出错");
        } else {
            System.out.println("jsMianji = " + jsMianji);
        }
    }
}
