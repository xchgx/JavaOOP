/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course23.beike01;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<Integer> zhaohuanReady = new ArrayList<>();//选中的武器
        zhaohuanReady.add(18);//集合中添加长度为18的武器
        zhaohuanReady.add(20);//集合中添加长度为20的武器
        zhaohuanReady.add(23);//集合中添加长度为23的武器
        Integer a = zhaohuanReady.remove(0);
        System.out.println("a = " + a);
        Integer b = zhaohuanReady.remove(1);
        System.out.println("b = " + b);
        Integer c = zhaohuanReady.remove(2);
        System.out.println("c = " + c);
    }
}
