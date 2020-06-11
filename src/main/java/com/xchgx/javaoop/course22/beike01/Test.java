/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course22.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        int[] madeNwuqi = manager.madeNwuqi(10);
        System.out.println("王之财宝:");
        for (int i = 0; i < madeNwuqi.length; i++) {
            int j = madeNwuqi[i];
            System.out.println(j);
        }
        int[] randomExtract = manager.randomExtract();
        System.out.println("抽取区间：");
        for (int i = 0; i < randomExtract.length; i++) {
            int j = randomExtract[i];
            System.out.println("j = " + j);
        }
    }
}
