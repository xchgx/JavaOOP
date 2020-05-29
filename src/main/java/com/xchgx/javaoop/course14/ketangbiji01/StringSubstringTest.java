/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试 从字符串中截取子字符串功能 substring()
 * @author 陈老师 现代管理学院
 */
public class StringSubstringTest {
    public static void main(String[] args) {
        String str = "张佳豪 9:39:08";
        String time = str.substring(4);//截取子字符串，输入开始下标
        System.out.println("time="+time);
        String name = str.substring(0,3);//截取指定范围的子字符串，输入开始和结束下标
        System.out.println("name = " + name);
    }
}
