/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course12.beike01;

/**
 * 二维数组测试
 * @author 陈老师 现代管理学院
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        char[][]  qp = new char[3][3];
        for(int i=0; i<qp.length; i++){
            for(int j=0; j<qp[i].length; j++){
                qp[i][j] = ' ';
            }
        }
        qp[0][0] = 'X';
        qp[0][1] = 'O';
        qp[0][2] = 'X';
        qp[1][2] = 'O';
        qp[2][2] = 'X';
        for(int i=0; i<qp.length; i++){
            for(int j=0; j<qp[i].length; j++){
                System.out.print(qp[i][j]);
            }
            System.out.println("");
        }
        
    }
}
