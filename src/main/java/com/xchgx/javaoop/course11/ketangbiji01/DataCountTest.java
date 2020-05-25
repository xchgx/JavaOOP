/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course11.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class DataCountTest {
    public static void main(String[] args) {
        int[] arr = {20,11,41,31};//[0,4)
        DataCount dc = new DataCount(arr);
        int maxByRange = dc.maxByRange(2); //执行后的结果是
        System.out.println("maxByRange = " + maxByRange);
        int maxByRange1 = dc.maxByRange(1, 3);//[1,3)
        System.out.println("maxByRange1 = " + maxByRange1);
        int maxIndexByRange = dc.maxIndexByRange(0);
        System.out.println("maxIndexByRange = " + maxIndexByRange);
        int maxIndexByRange1 = dc.maxIndexByRange(0, 2); //[0,1]
        System.out.println("maxIndexByRange1 = " + maxIndexByRange1);
    }
}
