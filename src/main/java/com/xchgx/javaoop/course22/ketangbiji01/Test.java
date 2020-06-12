/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course22.ketangbiji01;

/**
 * 测试随机区间
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager();//创建管理类的实例
        int[] nwuqis = manager.madeNwuqi(10); //产生n把武器的 王之财宝
        for (int i = 0; i < nwuqis.length; i++) {
            int nwuqi = nwuqis[i];
            System.out.println("武器"+nwuqi+"号  ");
        }
        
        System.out.println("第1次随机抽");
        int[] qujian1 = manager.randomExtract(6); //开始随机区间
        for (int i = 0; i < qujian1.length; i++) {
            int j = qujian1[i];
            System.out.print(j+" ");
        }
        
        System.out.println("第2次随机抽");
        int[] qujian2 = manager.randomExtract(4); //开始随机区间
        for (int i = 0; i < qujian2.length; i++) {
            int j = qujian2[i];
            System.out.print(j+" ");
        }
    }
}
