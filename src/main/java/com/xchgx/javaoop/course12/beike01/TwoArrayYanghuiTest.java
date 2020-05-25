package com.xchgx.javaoop.course12.beike01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 陈老师 现代管理学院
 */
public class TwoArrayYanghuiTest {
    public static void main(String[] args) {
        int line0[] = {1};
        int line1[] = {1,1};
        int line2[] = {1,2,1};
        int line3[] = {1,3,3,1};
        int hui [][] = new int[4][];
        hui[0] = line0;
        hui[1] = line1;
        hui[2] = line2;
        hui[3] = line3;
        for (int i = 0; i < hui.length; i++) { 
            for (int j = 0; j < hui[i].length; j++) { 
                System.out.print(hui[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
