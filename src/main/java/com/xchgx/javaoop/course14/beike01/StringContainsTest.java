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
public class StringContainsTest {

    public static void main(String[] args) {
        String str = "abc def!";
        System.out.println("是否包含空格：" + str.contains(" "));
        System.out.println("是否包含de：" + str.contains("de"));
        System.out.println("是否包含cde：" + str.contains("cde"));
        //输出结果：
        //是否包含空格：true
        //是否包含de：true
        //是否包含cde：false
    }
}
