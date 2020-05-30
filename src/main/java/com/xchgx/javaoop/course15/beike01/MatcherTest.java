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
public class MatcherTest {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher("11aa22bb33");
        
        if (matcher.find()) { 
            int start = matcher.start();
            System.out.println("start = " + start);
            int end = matcher.end();
            System.out.println("end = " + end);
            String group = matcher.group();
            System.out.println("group = " + group);
        }
         if (matcher.find()) { 
            int start = matcher.start();
            System.out.println("start = " + start);
            int end = matcher.end();
            System.out.println("end = " + end);
            String group = matcher.group();
            System.out.println("group = " + group);
        }  
        boolean lookingAt1 = matcher.lookingAt();
        if (lookingAt1) { 
            int start = matcher.start();
            System.out.println("start = " + start);
            int end = matcher.end();
            System.out.println("end = " + end);
            String group = matcher.group();
            System.out.println("group = " + group);
        }
        Matcher matcher1 = p.matcher("223bb44aa");
        boolean lookingAt = matcher1.lookingAt();
        if (lookingAt) {
            int start = matcher1.start();
            System.out.println("start = " + start);
            int end = matcher1.end();
            System.out.println("end = " + end);
            String group = matcher1.group();
            System.out.println("group = " + group);
        }
    }
}
