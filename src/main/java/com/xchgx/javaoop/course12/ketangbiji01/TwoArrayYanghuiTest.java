/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.ketangbiji01;

/**
 * 二维数组存放杨辉三角
 * @author 陈老师 现代管理学院
 */
public class TwoArrayYanghuiTest {
    public static void main(String[] args) {
        int[] line0 = {1};//一维数组
        int[] line1 = {1,1};
        int[] line2 = {1,2,1};
        int[] line3 = {1,3,3,1};
        int hui[][] = new int[4][];//分配4行
        hui[0] = line0;
        hui[1] = line1;
        hui[2] = line2;
        hui[3] = line3;
        for(int row=0; row<hui.length; row++){
            //循环读出每一行
            for(int col=0; col<hui[row].length;col++){
                //每次读出第 row 行的第 col 列
                System.out.print(hui[row][col]+"\t");//输出数组元素
            }
            System.out.println("");//输出换行
        }
    }
}
