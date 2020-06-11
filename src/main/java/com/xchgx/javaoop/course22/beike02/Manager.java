/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course22.beike02;

import java.util.ArrayList;

/**
 * 专门负责武器（王之财宝）的管理
 * @author 陈老师 现代管理学院
 */
public class Manager {
    public int[] nwuqis;//创建成员属性，用来保存产生的n把武器（王之财宝）
    /**
     * 产生n把武器
     * @param n 输入数组的长度
     * @return 一维数组，长度各不相同的数组
     */
    public int[] madeNwuqi(int n){
        //随机数重复,11,13,18,18
        ArrayList<Integer> list = new ArrayList<>();//创建一个动态数组集合
        //给该集合中添加 王之财宝 可能出现的长度。[10,n+10)
        for (int i = 0; i < n; i++) {//有可能30<n，而出现数组越界的异常。
            list.add(i+10);//逐个添加到集合中
        }
        //如何将n把武器随机放在数组当中
        //把list当做一副牌，我们开始随机抽排，重新组合成一个随机的乱序的数组。
        int[] wuqis = new int[n];//先分配n个元素空间
        for(int i=0; i<wuqis.length; i++){ //
            double random = Math.random();//这个是[0,1)的小数
            double range = random*list.size();//这是随机数的范围[0,size())
            int r = (int)range;//直接截断小数点后面的数字，只保留整数部分
            Integer removeNumber = list.remove(r);//从集合中删除下标为r的元素，并将删除的元素返回。
            wuqis[i]=removeNumber;//将列表集合中删除的元素值保存在数组当中。
        }
        this.nwuqis = wuqis;//将产生的n把武器数组保存在成员属性中。
        return wuqis;//返回该王之财宝。
    }
    
    /**
     * 随机抽到一个区间 
     * @return 
     */
    public int[] randomExtract(){
//        区间的范围，至少有3个，最多可以很多，当然不能太多，我们可以设定一个上限。
//为了公平起见，给所有的客人都有相同数量的武器，这就表示区间的宽度是一致的，这里我们使用硬编码锁定，区间宽度是5个。
//不同的是，区间的开始和结束是不一样的。
//第一、首先保证，区间的开始一定在武器的数组范围内。那么第一个随机数就是[0,length-5)
        int left = (int)(Math.random()*(nwuqis.length-5));//这是区间的起点。
        int right = left+5;//区间的终点直接加上区间的宽度5即可。
        int[] qujian  = new int[5];
        for(int i=left,j=0; i<right; i++,j++){
            qujian[j] = nwuqis[i];
        }
        return qujian;
    }
}
