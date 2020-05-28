/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class StringSplitTest {
    public static void main(String[] args) {
        String str = "1,2,3,4,5";
        String[] split = str.split(",");
        for(String s : split){
            System.out.print(s+"\t");
        }
        System.out.println("");
        String str2 = "12,13,14,15,16,17";
        String[] split1 = str2.split(",1");
        for(String s : split1){
            System.out.print(s+"\t");
        }
        
        
    }
}
