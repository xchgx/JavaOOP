/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course09.beike03;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class FindMax {
    public static void main(String[] args) {
        int[] numArr = {1,4,5,678,8,9,9,5,3};
        int max = numArr[0];
        for(int i=1; i<numArr.length; i++){
            if(numArr[i]>max){max = numArr[i];}
        }
        System.out.println("max= " + max);
    }
}
