/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.example02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class ZhengfangxingTest {

    public static void main(String[] args) {
        Zhengfangxing zfx = new Zhengfangxing(3);//构造边长为4的正方形对象
        double jsZhouchang = zfx.jsZhouchang();
        if (jsZhouchang == 3 * 4) {
            System.out.println("jsZhouchang = " + jsZhouchang);
        }else{
            System.out.println("计算周长出错");
        }
        
        double jsMianji = zfx.jsMianji();
        if(jsMianji == 3*3){
            System.out.println("jsMianji = " + jsMianji);
        }else{
            System.out.println("计算面积出错");
        }
    }
}
