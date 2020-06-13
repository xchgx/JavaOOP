/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course23.beike01;

import java.awt.Color;
import java.util.ArrayList;

/**
 * 专门负责武器（王之财宝）的管理
 *
 * @author 陈老师 现代管理学院
 */
public class Manager {

    public int[] nwuqis;//创建成员属性，用来保存产生的n把武器（王之财宝）

    /**
     * 产生n把武器
     *
     * @param n 输入数组的长度
     * @return 一维数组，长度各不相同的数组
     */
    public int[] madeNwuqi(int n) {
        //随机数重复,11,13,18,18
        ArrayList<Integer> list = new ArrayList<>();//创建一个动态数组集合
        //给该集合中添加 王之财宝 可能出现的长度。[10,n+10)
        for (int i = 0; i < n; i++) {//有可能30<n，而出现数组越界的异常。
            list.add(i + 10);//逐个添加到集合中
        }
        //如何将n把武器随机放在数组当中
        //把list当做一副牌，我们开始随机抽排，重新组合成一个随机的乱序的数组。
        int[] wuqis = new int[n];//先分配n个元素空间
        for (int i = 0; i < wuqis.length; i++) { //
            double random = Math.random();//这个是[0,1)的小数
            double range = random * list.size();//这是随机数的范围[0,size())
            int r = (int) range;//直接截断小数点后面的数字，只保留整数部分
            Integer removeNumber = list.remove(r);//从集合中删除下标为r的元素，并将删除的元素返回。
            wuqis[i] = removeNumber;//将列表集合中删除的元素值保存在数组当中。
        }
        this.nwuqis = wuqis;//将产生的n把武器数组保存在成员属性中。
        return wuqis;//返回该王之财宝。
    }

    //随机抽取区间
    public int[] randomExtract(int width) {//暂时把区间宽度定为 4
        //随机抽取一个区间[l,r]，l是多少，r是多少
        //区间范围是 0 ~ nwuqis.length 数组的长度
//        int width = 4;//把所有的常量4改为变量width
        int left = (int) (Math.random() * (nwuqis.length - width));//产生一个[0,数组长度-宽度)的范围
        int right = left + width;//区间的结束right可以通过left+width推算出来
        int[] qujian = new int[width];//创建一个和区间宽度一样大小的数组
        for (int i = left, j = 0; i < right; i++, j++) {
            qujian[j] = nwuqis[i];//依次获得n把武器中的left,right的区间元素值
        }
        return qujian;//把王之财宝中的一段连续的空间，复制到区间数组中，并返回
    }

    /**
     * 执行召唤动作
     *
     * @param a 武器a
     * @param b 武器b
     * @param c 武器c
     * @return true:表示召唤金闪闪成功； false：表示召唤失败
     */
    public boolean zhaohuan(int a, int b, int c) {
//        return a + b > c && b + c > a && a + c > b; //召唤成功
        //召唤失败
        if(a+b>c && b+c>a && c+a>b){
            return true;//召唤成功
        }else{
            return false;//召唤失败
        }
    }

    public int[] findTriangle(int[] arr) {
        int[] finded = new int[3];
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    boolean zhaohuan = zhaohuan(arr[i], arr[j], arr[k]);
                    if (zhaohuan) {
                        finded[0] = i;
                        finded[1] = j;
                        finded[2] = k;
                        return finded;
                    }
                }
            }
        }
        return finded;
    }

    public boolean findedContain(int[] finded, int i ) {
        for (int j = 0; j < finded.length; j++) {
            int k = finded[j]; 
            if (k == i) {
                return true;//包含，是找到的三角形武器中的一把
            }
        }
        return false;
    }
}
