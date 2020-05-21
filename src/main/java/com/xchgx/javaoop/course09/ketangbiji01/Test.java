/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course09.ketangbiji01;

import com.xchgx.javaoop.course07.ketangbiji07.英雄;



/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        int[] intArr;//创建的只是一个引用
        float floatArr[];
        //思考，数组里面装什么 
//        int[] ageArr;
//        英雄[] heroArr;
       intArr = new int[8];//分开分配空间，要使用 new 
       floatArr = new float[10];


       String[] nameArr = {"张三","李四","王五","赵六","孙七"};//姓名
       int[] ageArr = {18,19,18,20,22};//定义并初始化，年龄
        System.out.println(nameArr[0]+":"+ageArr[0]+"岁");
        System.out.println(nameArr[1]+":"+ageArr[1]+"岁");
        System.out.println(nameArr[2]+":"+ageArr[2]+"岁");
        System.out.println(nameArr[3]+":"+ageArr[3]+"岁");
        System.out.println(nameArr[4]+":"+ageArr[4]+"岁"); 
        
    }
}
