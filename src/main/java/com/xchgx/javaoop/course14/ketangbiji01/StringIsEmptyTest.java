/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.ketangbiji01;

/**
 * 测试字符串判断是否为空字符串的功能 isEmpty()
 * @author 陈老师 现代管理学院
 */
public class StringIsEmptyTest {
    public static void main(String[] args) {
        String str = "";//空字符串
        if(str.isEmpty()){//是空的么？
            System.out.println("str字符串是空字符串");
            str = "xx";
        }
        String str2;//这里创建了字符串变量的引用，但是没有初始化赋值
//        str2.isEmpty();//对于没有初始化的字符串，
        //直接调用任何方法都会报错。Null异常
        
    }
}
