/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course11.ketangbiji01;

/**
 * 数据统计类
 *
 * @author 陈老师 现代管理学院
 */
public class DataCount {

    private int[] arr;//数组

    /**
     * 在指定范围内查找最大值
     *
     * @param start 起始下标
     * @return 范围内的最大值
     */
    public int maxByRange(int start) {
//        int max = arr[start];
//        for(int i = start; i<arr.length; i++){//[start,arr.length]
//           if(arr[i]>max){
//               max = arr[i];
//           }
//        }
//        return max;
        return maxByRange(start, arr.length);
    }

    /**
     * 给定范围[start,end)内查找最大值
     *
     * @param start 范围的开始下标
     * @param end 范围的结束下标
     * @return 最大值
     */
    public int maxByRange(int start, int end) {
        int max = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 数组元素交换
     *
     * @param i 数组下标
     * @param j 数组的另一个下标
     */
    public void swap(int i, int j) {
        int temp = arr[i];//保存一个副本
        arr[i] = arr[j];//元素arr[j]保存在arr[i]里面
        arr[j] = temp;//把i之前保存的数值赋值给j元素
    }

    /**
     * 在指定范围内 查找最大值的下标
     *
     * @param start 数组的开始下标
     * @param end 数组的结束下标
     * @return 返回最大值的下标
     */
    public int maxIndexByRange(int start, int end) {
        int max = arr[start];//把起始下标所指的数组元素作为初始最大值
        int maxIndex = start;//把起始下标作为最大值初始下标
        for (int i = start; i < end; i++) {//循环范围是[start,end)
            if (arr[i] > max) {//查找更大的值
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;//返回最大值的下标
    }

    /**
     * 查找范围内最小值的下标（索引）
     *
     * @param start
     * @param end
     * @return
     */
    public int minIndexByRange(int start, int end) {
        int min = arr[start];//把起始下标所指的数组元素作为初始最大值
        int minIndex = start;//把起始下标作为最大值初始下标
        for (int i = start; i < end; i++) {//循环范围是[start,end)
            if (arr[i] < min) {//查找更大的值
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;//返回最大值的下标
    }
    /**
     * 重载搜索指定范围内最小值的下标，默认结束下标是数组的长度
     * @param start 范围的开始下标
     * @return 
     */
    public int minIndexByRange(int start) {
        return minIndexByRange(start, arr.length);
    }
    /**
     * 指定范围内（指定下标到数组末尾）查找最大值下标
     *
     * @param start 指定数组的开始下标
     * @return 最大值下标
     */
    public int maxIndexByRange(int start) {
        return maxIndexByRange(start, arr.length);//给定查找范围的结束，调用重载方法实现
    }

    //编写排序算法——“选择排序”
    //倒序排序
    public int[] sortDesc() {//选择排序算法的从大到小排序
//        int start = 0;//搜索范围的开始下标
//        int end = arr.length;//搜索范围的结束下标
//        int i = 0;//交换的开始下标
//        int j = 0; //交换的另一个下标

        for (int start = 0; start < arr.length; start++) {
            int maxIndex = maxIndexByRange(start);
            swap(start, maxIndex);//把最大值位置和搜索范围的最开始位置交换
        }
        //第一轮，从0开始搜索最大值下标
//        start++;//范围缩小，向右移动1位。
        //第二轮，从start+1开始搜索最大值下标，将会搜索出第二大的值
//        int maxIndex2 = maxIndexByRange(start);
//        swap(start,maxIndex2);
//        start++;//继续缩小范围，向右移动1位
        return arr;
    }
    public int[] sortAsc(){//选择排序算法的从小到大排序
        for (int i = 0; i < arr.length; i++) {
            int minIndex = minIndexByRange(i);
            swap(i,minIndex);
        }
        return arr;
    }

    //由IDE工具模版自动生成的代码
    //生成带参数的构造器和getter、setter
    public DataCount(int[] arr) {
        this.arr = arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

}
