/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course11.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class DataCount {

    private int[] arr;

    //存心的、故意的、专门的 不创建无参默认构造器
    //因为arr属性必须要传入赋值，不能为空
    //所以现在创建一个带参数的构造器，给arr属性赋值
    public DataCount(int[] arr) {
        this.arr = arr;
    }

    /**
     * 求最大值
     *
     * @return 最大值
     */
    public int max() {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
        return maxByRange(0);
    }

    /**
     * 求最大值的数组下标
     *
     * @return 最大值下标
     */
    public int maxIndex() {
//        int max = arr[0];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                index = i;
//            }
//        }
//        return index;
        return maxIndexByRange(0);
    }

    /**
     * 求最小值
     *
     * @return 最小值
     */
    public int min() {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求最小值的数组下标
     *
     * @return 最小值 下标
     */
    public int minIndex() {
//        int min = arr[0];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//                index = i;
//            }
//        }
//        return index;
        return minIndexByRange(0);
    }

    /**
     * 求累加和
     *
     * @return 累加和
     */
    public int sum() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 求平均值
     *
     * @return 平均值
     */
    public double avr() {
        return sum() * 1.0 / arr.length;
    }

    /**
     * 显示数组的所有元素
     *
     * @return 显示数组的所有元素
     */
    public String showAll() {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += "arr[" + i + "]=" + arr[i] + "\n";
        }
        return result;
    }

    /**
     * 简单显示数组，用空格隔开数组元素
     *
     * @return 简单显示数组
     */
    public String showEasy() {
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

    /**
     * 将数组元素交换
     *
     * @param i 交换元素的下标
     * @param j 另一个交换元素的下标
     */
    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 复制一份一模一样的数组。
     *
     * @return 拷贝后的数组
     */
    public int[] copy() {
        int[] newArr = new int[arr.length];
        for (int i : arr) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * 从数组的指定范围内寻找最大值。 查找范围是 [start, arr.length]
     *
     * @param start 从start开始
     * @return 最大值
     */
    public int maxByRange(int start) {
//        int max = arr[start];
//        for (int i = start; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;

        return maxByRange(start, arr.length);
    }

    /**
     * 从数组的指定范围内寻找最大值。 查找范围是 [start, end]，其中 end 小于等于 arr.length;
     *
     * @param start
     * @param end
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

    public int maxIndexByRange(int start) {
        return maxIndexByRange(start, arr.length);
    }

    public int maxIndexByRange(int start, int end) {
        int max = arr[start];
        int maxIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public int minIndexByRange(int start) {
        return minIndexByRange(start, arr.length);
    }

    public int minIndexByRange(int start, int end) {
        int min = arr[start];
        int minIndex = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    //排序
    public int[] sortDesc() {
        int i = 0;
//        int j=0;
        while (i < arr.length) {
//        int max = maxByRange(j);
            int maxIndex = maxIndexByRange(i);
            swap(i, maxIndex);
            i++;
//        j++;
        }
        return arr;
    }

    //排序
    public int[] sortAsc() {
       for(int i=0; i<arr.length; i++){
            int maxIndex = minIndexByRange(i);
            swap(i, maxIndex);
        }
        return arr;
    }
    
}
