/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串的全部替换功能 replaceAll()
 *
 * @author 陈老师 现代管理学院
 */
public class StringReplaceAllTest {

    public static void main(String[] args) {
        String str = "张佳豪胡文 9:39:08";   
        String str2 = str.replaceAll("张佳豪..", "何砼洋");//点符号(.)表示匹配1个任意字符
        System.out.println("str2 = " + str2);//何砼洋 9:39:08
        String str3 = str2.replaceAll("9", ""); //把数字9替换为空字符串,相当于删除字符9
        System.out.println("str3 = " + str3);//何砼洋 :3:08
        String str4 = str.replaceAll("\\d", "").replaceAll(":", "");//   \d 表示数字是正则表达式的特殊符号
        //，但它不是我们Java的转义字符 Java字符串的"\\d"会变成 \d
        System.out.println("str4 = " + str4);
        
    }
}
