/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course29.ketangbiji01;

/**
 * 交换算法
 *
 * @author 陈老师 现代管理学院
 */
public class Swap {

    public static void main(String[] args) {
        int[] age = {1, 2, 56};
        System.out.println("交换之前的原始排列");
        for (int a : age) {
            System.out.print(a + " ");
        }
        swap(age, 0, 2);//对数组age操作，将下表0和2交换
        System.out.println("\n交换之后的排列");
        for (int a : age) {
            System.out.print(a + " ");
        } 
    }

    public static void swap(int[] age, int i, int j) {
        int temp = age[i];//56保存在临时变量中
        age[i] = age[j];// 1[0] 赋值给 56的位置[2]
        age[j] = temp;//把临时变量中的56 放在下表为0的位置
    }
}
