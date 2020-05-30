/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.beike01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Pattern.matcher(String regex,CharSequence
 * input)是一个静态方法,用于快速匹配字符串,该方法适合用于只匹配一次,且匹配全部字符串. 
 * @author 陈老师 现代管理学院
 */
public class PatternMatcherTest {

    public static void main(String[] args) {
        boolean matches = Pattern.matches("\\d+", "2223"); //返回true 
        System.out.println("matches = " + matches);
        boolean matches1 = Pattern.matches("\\d+", "2223aa"); //返回false,需要匹配到所有字符串才能返回true,这里aa不能匹配到 
        System.out.println("matches1 = " + matches1);
        boolean matches2 = Pattern.matches("\\d+", "22bb23"); //返回false,需要匹配到所有字符串才能返回true,这里bb不能匹配到 
        System.out.println("matches2 = " + matches2);
        
        /*
        说了这么多,终于轮到Matcher类登场了,Pattern.matcher(CharSequence input)返回一个Matcher对象.
        Matcher类的构造方法也是私有的,不能随意创建,只能通过Pattern.matcher(CharSequence input)方法得到该类的实例.
        Pattern类只能做一些简单的匹配操作,要想得到更强更便捷的正则匹配操作,那就需要将Pattern与Matcher一起合作.Matcher类提供了对正则表达式的分组支持,以及对正则表达式的多次匹配支持.
         */
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher("22bb23");
//        Pattern pattern = matcher.pattern();//返回p 也就是返回该Matcher对象是由哪个Pattern对象的创建的
        boolean matches3 = matcher.matches();
        System.out.println("matches3 = " + matches3);//false 不能完全匹配
        boolean matches4 = p.matcher("223344").matches();
        System.out.println("matches4 = " + matches4);//true 完全匹配
        boolean lookingAt = matcher.lookingAt();
        System.out.println("lookingAt = " + lookingAt);//最前面是数字 true
        boolean lookingAt1 = p.matcher("bb2233").lookingAt();
        System.out.println("lookingAt1 = " + lookingAt1);//最前面是数字 false
        boolean find = p.matcher("22bb23").find();
        System.out.println("find = " + find);//true 任何位置能找到数字
        boolean find1 = p.matcher("bbaaa").find();
        System.out.println("find1 = " + find1);//false 找不到数字
        
        
    }
}
