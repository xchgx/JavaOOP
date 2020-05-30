/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course15.beike01;

import java.util.regex.Pattern;

/**
 * 创建正则表达式模式。
 * @author 陈老师 现代管理学院
 */
public class PatternCompileCreateTest {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*index.*");//创建一个正则表达式对象
        String pattern1 = pattern.pattern();//查看表达式内容
        System.out.println("pattern1 = " + pattern1);
        
    }
}
