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
public class StringSubstringTest {

    public static void main(String[] args) {
        String str = "www.hbou.cn";
        System.out.print("返回值 :");
        System.out.println(str.substring(4));//从下标4开始到字符串末尾
        System.out.print("返回值 :");
        System.out.println(str.substring(4, 8));//从下标4开始，到下标8截止（不包含8）。
        //输出结果
        //返回值 :hbou.cn
        //返回值 :hbou
        System.out.println("www.hbou.cn".substring(4, 8));
    }
}
