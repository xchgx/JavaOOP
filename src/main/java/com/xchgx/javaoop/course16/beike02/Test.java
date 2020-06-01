/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course16.beike02;

import java.util.StringTokenizer;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        String str = "Hi, I'm John. 10 years.";
        StringTokenizer st = new StringTokenizer(str,",. ");
        int countTokens = st.countTokens();
        System.out.println("countTokens = " + countTokens);
        while(st.hasMoreTokens()){
            String nextToken = st.nextToken();
            System.out.println("nextToken = " + nextToken);
        }
    }
}
