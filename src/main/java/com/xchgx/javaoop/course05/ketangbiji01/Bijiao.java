/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Bijiao {//比较类， 用于数字比较
//    public long max(float b, int a){return 1;}//(1,2.2) //1.1  2.2
    public double max(double a, double b){ 
        return a>b?a:b; 
    }
    public float  max(float a, float b){ 
        return a>b?a:b;  
    }
    public int    max(int a, int b){//两个数字作为参数传入进来 (1,1)
        return a>b?a:b;//用三元运算符直接获得最大的数字
    } 
    public String max(String s1, String s2){
        int compareTo = s1.compareTo(s2);
        if(compareTo>0){return s1;}
        else return s2;
    }
    public void max(  ){
        return ;
    }
}
