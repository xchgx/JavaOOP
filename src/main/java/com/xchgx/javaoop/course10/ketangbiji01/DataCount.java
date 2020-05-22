/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course10.ketangbiji01;

/**
 * 数据统计类
 * @author 陈老师 现代管理学院
 */
public class DataCount {
    //属性
    private int[] arr;//原始数据，由调用者传入
    //方法
    //求最大值
    public int max(){
//      arr={-11,200,300}
//        int max = -1000;//不合理的设计
        int max = arr[0];//把数组的下标为0 的元素作为基准
        for(int i=0; i<arr.length; i++){//遍历数组
            if(arr[i] > max){//若碰到了比max更大的数字，就更新max的值
                max = arr[i];
            }
        }
        return max;//返回最大值
    }
    //求最大值的索引（下标）
    public int maxIndex(){
        int max  = arr[0];
        int index = 0;//默认为数组的第1个元素
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
         }
        return index;
    }
    //求最小值
    public int min(){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
     /**
     * 求最小值的数组下标
     * @return 最小值 下标
     */
    public int minIndex(){
        int min = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }
        return  index;
    }
    //求和（累加和）
    public int sum(){
        //arr= {1,3,4,5};
        int sum = 0;//1 4 8 13
        for(int i=0; i<arr.length; i++){//遍历数组，将所有的元素值累加
            sum = sum + arr[i];
//            sum += arr[i];
        }
        return sum;
    }
    //求平均值
    public double avr(){
        return this.sum()*1.0/arr.length; 
    }
    //简单显示数组所有的元素
    public String showEasy(){
        String result = "";//准备一个字符串用来保存数组的所有元素
        for(int i=0; i<arr.length; i++){
            result += arr[i]+" ";
        }
        return result;
    }
    //详细显示数组所有的元素
    public String showAll(){
         /*
        arr[0]=1
        arr[1]=2
        arr[2]=4
        arr[3]=3 
        */
        String result = "";//准备一个装数组元素的字符串
        for(int i=0; i<arr.length; i++){
            result += "\narr[" + i + "]=" + arr[i];
        }
        return result; 
    }
    //下面的内容由IDE工具生成
    //构造方法
    public DataCount(int[] arr) {
        this.arr = arr;//数组长度和数组元素的值
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
}
