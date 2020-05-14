/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.ketangbiji03;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Test {
    public static void main(String[] args) {
        Xingzhuang xz1 = new Sanjiaoxing();
        Xingzhuang xz2 = new Sibianxing();
        Xingzhuang xz3 = new Wubianxing();
        System.out.println("输出三角形");
        xz1.draw();//输出三角形文字
        System.out.println("输出四边形");
        xz2.draw();//画出四边形图形
        System.out.println("输出五边形");
        xz3.draw();//输出五边形文字
    }
}
