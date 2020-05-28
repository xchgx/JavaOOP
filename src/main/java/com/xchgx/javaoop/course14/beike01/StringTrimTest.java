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
public class StringTrimTest {
    public static void main(String[] args) {
        String str = "    abc     ";//两边有若干个空格。
        System.out.println("原样输出：");
        System.out.println(str);
        System.out.println("调用trim()方法之后的输出：");
        System.out.println(str.trim());
//原样输出：
//    abc     
//调用trim()方法之后的输出：
//abc        
    }
}
