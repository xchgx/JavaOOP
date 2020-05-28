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
public class StringIsEmptyTest {
    public static void main(String[] args) {
        String str = "";
        System.out.println("str.isEmpty() = "+str.isEmpty());
        String str2 = new String();
        System.out.println("str2.isEmpty() = "+str2.isEmpty());
        String str3 = " ";
        System.out.println("str3.isEmpty() = "+str3.isEmpty());
        System.out.println("str3.trim().isEmpty() = "+str3.trim().isEmpty());
        String str4 = "17902055";
        System.out.println(str4.replaceAll("\\d","").isEmpty());
//str.isEmpty() = true
//str2.isEmpty() = true
//str3.isEmpty() = false
//str3.trim().isEmpty() = true
//true
    }
}
