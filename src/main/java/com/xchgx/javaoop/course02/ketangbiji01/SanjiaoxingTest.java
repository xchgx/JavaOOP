/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class SanjiaoxingTest {//三角形的测试类
    public static void main(String[] args) {
        Sanjiaoxing sjx = new Sanjiaoxing(3,4,5);//创建三角形对象
        
        double jsZhouchang = sjx.jsZhouchang(); //测试周长计算
        if(jsZhouchang != 12/*正确的值*/){
            System.out.println("周长计算出错");
        }else{
            System.out.println("jsZhouchang = " + jsZhouchang);
        }
         
        double jsMianji = sjx.jsMianji(); //测试面积计算
        if(jsMianji != 6){
            System.out.println("计算面积出错");
        }else{
            System.out.println("jsMianji = " + jsMianji);
        }
    }
}
