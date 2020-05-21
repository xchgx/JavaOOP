/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.child.other.baby;

import java.util.Arrays; 

/**
 *
 * @author 陈老师 现代管理学院
 */
public class 小学分数比较 {
    public static void main(String[] args) {
        分数[] fs = {
            new 分数(4, 5),
            new 分数(11, 12),
            new 分数(8, 7),
            new 分数(3, 8),
            new 分数(1, 2),
            new 分数(15, 44)
        };
//        double[] results = new double[fs.length];
//        for(int i = 0; i<fs.length; i++){
//             results[i] = fs[i].getResult();
//        } 
        Arrays.sort(fs);
        for(int i = 0; i<fs.length; i++){
             System.out.println(fs[i]+","+fs[i].getResult());
        } 
    }
}
