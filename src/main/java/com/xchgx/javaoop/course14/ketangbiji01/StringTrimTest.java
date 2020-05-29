/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串去除两边空格的功能 trim()
 * @author 陈老师 现代管理学院
 */
public class StringTrimTest {
    public static void main(String[] args) {
        String str = "    a    b    cde   ";
        System.out.println("str=" + str);//原样输出
        System.out.println("str.trim()=" + str.trim());//去掉两边空格后输出
    }
}
