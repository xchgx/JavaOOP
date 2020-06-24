/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course29.ketangbiji01;

/**
 * 遍历算法
 *
 * @author 陈老师 现代管理学院
 */
public class Bianli {

    public static void main(String[] args) {
        int[] books = new int[10];//分配10个内存连续空间
        for (int i = 0; i < books.length; i++) {//遍历
            int r = (int) (Math.random() * 20);
            books[i] = r;//
        }
        for (int j : books) {//for in 语句 遍历 
            System.out.println("书号：" + j);//输出
        }

    }
}
