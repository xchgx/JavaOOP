/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course10.ketangbiji01;

/**
 * 数据统计类测试
 * @author 陈老师 现代管理学院
 */
public class DataCountTest {
    public static void main(String[] args) {
        int[] ageArr = {1,5,9,14,2};//创建数组的同时进行初始化
        DataCount dc = new DataCount(ageArr);// 要传入实参 
        int max = dc.max();
        System.out.println("max = " + max);//最大值
        System.out.println("dc.min() = " + dc.min());//最小值
        System.out.println("dc.sum() = " + dc.sum());//所有元素的和
        System.out.println("dc.avr() = " + dc.avr());//求平均值
        System.out.println("dc.showEasy() = " + dc.showEasy());//简单输出
        System.out.println("dc.showAll() = " + dc.showAll());//详细输出
        
        System.out.println("dc.maxIndex() = " + dc.maxIndex());
    }
}
