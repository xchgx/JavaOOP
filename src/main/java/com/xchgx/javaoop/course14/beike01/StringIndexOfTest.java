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
public class StringIndexOfTest {
    public static void main(String[] args) {
          String string = "aaa456ac";
        //查找指定字符是在字符串中的下标。在则返回所在字符串下标；不在则返回-1.  
        System.out.println(string.indexOf("b")); // indexOf(String str); 返回结果：-1，"b"不存在  
        System.out.println(string.indexOf("a"));  //返回0
        System.out.println(string.indexOf("a4"));  //返回2
    }
}
