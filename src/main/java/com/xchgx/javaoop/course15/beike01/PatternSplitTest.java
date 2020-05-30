/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.beike01;

import java.util.regex.Pattern;

/**
 * 类似字符串的split，这里使用正则分割字符串。
 * Pattern有一个split(CharSequence input)方法,用于分隔字符串,并返回一个String[],我猜String.split(String regex)就是通过Pattern.split(CharSequence input)来实现的. 
Java代码示例: 
 * @author 陈老师 现代管理学院
 */
public class PatternSplitTest {

    public static void main(String[] args) {

        String str = "掌握字符串包含contains()方法的使用\n"
                + "掌握字符串查找indexOf()方法的使用\n"
                + "掌握字符串是否为空IsEmpty()方法的使用\n"
                + "掌握字符串全部替换ReplaceAll()方法的使用\n"
                + "掌握字符串分割成数组split()方法的使用\n"
                + "掌握字符串查子字符串substring ()方法的使用\n"
                + "掌握字符串去除两边空格trim()方法的使用";
        Pattern p = Pattern.compile("\n");
        String[] split = p.split(str);
        int i = 0;
        for(String s : split){
            System.out.println(++i+". "+s);
        }
    }

}
