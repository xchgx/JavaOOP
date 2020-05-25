/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.beike01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        System.out.println("list.size() = " + list.size());
        list.add(33);
        System.out.println("list.size() = " + list.size());
        for (int i = 0; i < 10; i++) {
            System.out.println("list.add(i+10);"+list.add(i+10));
        }
        System.out.println("list = " + list);
        list.remove(5);
        System.out.println("list = " + list);
        int indexOf = list.indexOf(16);
        System.out.println("indexOf = " + indexOf);  
        list.clear();
        System.out.println("list.size()"+list.size());
    }
}
