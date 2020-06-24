/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course28.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
//public class ExtendsChildTest extends ExtendsTest{
public class ExtendsChildTest {
    public static void main(String[] args) {
        
        String str = "1a2b3c4d5";
        String[] split = str.split("\\d");
        for (int i = 0; i < split.length; i++) {
            String string = split[i];
            System.out.println("string = " + string);
        }
    }

}
