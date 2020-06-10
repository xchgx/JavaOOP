/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course21.beike01;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Manager { 
    public int[] nwuqis;//保存n个武器
    public int[] madeNwuqi(int n){
        ArrayList<Integer> readyWuqi = new ArrayList<>();//创建数组集合（动态数组）
        for (int i = 0; i < n; i++) {//循环10次
            readyWuqi.add(i+1);//初始化集合，分别放入1~10，10个长度各不相同的武器
        }
        int[] wuqis = new int[n];//产生n个长度的数组
        for (int i = 0; i < wuqis.length; i++) {
            int r = (int)(Math.random()*readyWuqi.size());
            System.out.println("readyWuqi.size() = " + readyWuqi.size());
            wuqis[i] = readyWuqi.remove(r);            
        }
        this.nwuqis = wuqis;
        return wuqis;
    }
}
