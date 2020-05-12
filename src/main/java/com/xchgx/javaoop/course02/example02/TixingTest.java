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
public class TixingTest {//梯形功能测试
    public static void main(String[] args) {
        Tixing tx = new Tixing(3,6,4);
        double jsMianji=tx.jsMianji();
        if(jsMianji != (3+6)*4/2){
            System.out.println("计算面积出错");
        }else{
            System.out.println("jsMianji = " + jsMianji);
        }
    }
}
