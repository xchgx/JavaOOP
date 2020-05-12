/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course02.beike;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class SanjiaoxingTest {
    public static void main(String[] args) {
      Sanjiaoxing sjx = new Sanjiaoxing(3, 4, 5);
        double jsZhouchang = sjx.jsZhouchang();
        if(jsZhouchang != 12){System.out.println("周长计算出错");}
        else{ System.out.println("jsZhouchang = " + jsZhouchang);}
        
        double jsMianji = sjx.jsMianji(); 
        if(jsMianji != 6)System.out.println("面积计算出错");
        else System.out.println("jsMianji = " + jsMianji); 
        
    }
}
