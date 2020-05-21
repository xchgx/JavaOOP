/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Bijiao {
    public int max(int a, int b){
        return a>b?a:b;
    }
    private float max(float a, float b) {
        return a>b?a:b;
    }
    private double max(double a, double b) {
        return a>b?a:b; 
    }
     
    
    public static void main(String[] args) {
        Bijiao bj = new Bijiao();
        int max = bj.max(1,2);
        System.out.println(max!=2?"出错了":max);
//        if(max != 2){
//            System.out.println("max(int,int) 出错");
//        }else{
//            System.out.println("max = " + max);
//        }
        float max1 = bj.max(1.0f, 2.0f);
        if(max1 != 2){
            System.out.println("max(float,float)出错");
        }else{
            System.out.println("max1 = " + max1);
        } 
        double max2 = bj.max(1.0, 2.0);
        if(max2 != 2){
            System.out.println("max(double,double)出错");
        }else{
            System.out.println("max2 = " + max2);
        }  
    }
}
