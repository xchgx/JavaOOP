/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course15.beike01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class MatcherGroupTest {
    public static void main(String[] args) {
        //从一堆字符串中找出相同的名字
        String str = "张三来了，张三带着张三的小宠物来到了张三经常吃饭的餐馆。";
        Pattern p = Pattern.compile("张三");
        Matcher matcher = p.matcher(str);
        boolean find = matcher.find();
        if (find) {
            String group = matcher.group();
            System.out.println("group = " + group);
        }
    }
}
