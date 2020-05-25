/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course11.ketangbiji01;

/**
 * 数据统计类
 * @author 陈老师 现代管理学院
 */
public class DataCount {
    private int[] arr;//数组
    /**
     * 在指定范围内查找最大值
     * @param start 起始下标
     * @return 范围内的最大值
     */
    public int maxByRange(int start){
//        int max = arr[start];
//        for(int i = start; i<arr.length; i++){//[start,arr.length]
//           if(arr[i]>max){
//               max = arr[i];
//           }
//        }
//        return max;
        return maxByRange(start, arr.length);
    }
    public int maxByRange(int start, int end){
        int max = arr[start];
        for(int i=start; i<end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * 在指定范围内 查找最大值的下标
     * @param start 数组的开始下标
     * @param end   数组的结束下标
     * @return 返回最大值的下标
     */
    public int maxIndexByRange(int start,int end){
        int max = arr[start];
        int maxIndex = start;
        for(int i=start; i<end; i++){
            if(arr[i]>max){
                max = arr[i];
                maxIndex  = i;
            }
        }
        return maxIndex;//返回最大值的下标
    }
    public int maxIndexByRange(int start){
        return  maxIndexByRange(start, arr.length);
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
