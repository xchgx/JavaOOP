/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course09.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Test3 {
    public static void main(String[] args) {
        int[] ageArr = {18,19,30,20,21};//年龄数组
        //遍历数组
        int min = 200;//用来保存最大值
        for(int i=0; i<ageArr.length; i++){
            System.out.println(ageArr[i]);//直接输出
            if(ageArr[i] < min){
                //有比max还大的，就保存这个更大的数字
                min = ageArr[i]; 
            }
        }
        //等循环结束了，全部比较完了，我们就输出最大值
        System.out.println("最小值："+min);
    }
}








