/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course11.beike01;


/**
 *
 * @author 陈老师 现代管理学院
 */
public class DataCountTest {
    public static void main(String[] args) {
        int[] testArr  =  new int[]{200,1,4,5,6,4,11,32,23,55,12};
        DataCount bd = new DataCount(testArr);
      
        System.out.println("bd.max() = " + bd.max());
        System.out.println("bd.min() = " + bd.min());
        System.out.println("bd.sum() = " + bd.sum());
        System.out.println("bd.avr() = " + bd.avr());
        System.out.println("bd.showAll() = " + bd.showAll());
        System.out.println("bd.showEasy() = " + bd.showEasy());
        
        System.out.println("bd.maxIndex() = " + bd.maxIndex());
        System.out.println("bd.minIndex() = " + bd.minIndex());
        System.out.println("bd.maxByRange(0) = " + bd.maxByRange(0));
        System.out.println("bd.maxByRange(1) = " + bd.maxByRange(1));
        System.out.println("bd.maxByRange(1,4) = " + bd.maxByRange(1,4));
    }
}
