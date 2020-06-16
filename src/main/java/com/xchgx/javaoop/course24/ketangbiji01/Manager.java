/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course24.ketangbiji01;

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
    
    //随机抽取区间
    public int[] randomExtract(int width){//暂时把区间宽度定为 4
        //随机抽取一个区间[l,r]，l是多少，r是多少
        //区间范围是 0 ~ nwuqis.length 数组的长度
//        int width = 4;//把所有的常量4改为变量width
        int left = (int)(Math.random()*(nwuqis.length-width));//产生一个[0,数组长度-宽度)的范围
        int right = left+width;//区间的结束right可以通过left+width推算出来
        int[] qujian = new int[width];//创建一个和区间宽度一样大小的数组
        for(int i=left,j=0; i<right; i++,j++){
            qujian[j] = nwuqis[i];//依次获得n把武器中的left,right的区间元素值
        }
        return qujian;//把王之财宝中的一段连续的空间，复制到区间数组中，并返回
    }
    public boolean zhaohuan(int a,int b,int c){
//        if(a+b>c && b+c>a && c+a>b){
//            return true;
//        }else{
//            return false;
//        }
        if(a+b<=c){            return false;//不是三角形，召唤失败
        }
        if(b+c<=a){            return false;//不是三角形，召唤失败
        }
        if(c+a<=b){            return false;//不是三角形，召唤失败
        }
        return true;//符合召唤规则，召唤成功
    }
    /**
     * 搜索可以召唤出金闪闪的三把武器
     * @param qujian 随机抽取到的区间数组
     * @return 可以召唤出金闪闪的三把武器的数组
     */
    int[] findJinshanshan(int[] qujian) {
        int[] finded = new int [3];//创建三个长度的整型数组，用来保存搜索到的可以召唤金闪闪的三把武器
         for(int i=0; i<qujian.length-2;i++){
             for(int j = i+1; j< qujian.length-1; j++){
                 for(int k=j+1; k<qujian.length; k++){
                     boolean success = zhaohuan(qujian[i],qujian[j],qujian[k]); //召唤判断的是武器的长度，不是下标
                     if(success){
                         finded[0] = qujian[i];//第1把武器的长度保存
                         finded[1] = qujian[j];//第2把武器的长度保存
                         finded[2] = qujian[k];//第3把武器的长度保存
                         return finded;
                     }
                 }
             }
         }
         return null;//找不到可以召唤金闪闪的三把武器。
    }
    /**
     * 在数组中寻找指定的长度
     * @param finded 可以召唤出金闪闪的三把武器数组，有可能是null
     * @param wuqi 要查找的武器长度
     * @return 
     */
    public boolean belongToFinded(int[] finded,int wuqi){
        if(finded == null){//如果finded是null，表示整个区间根本就没有可以召唤的武器
            return false;//所以，这里可以直接返回false，表示没找到
        }
        for(int f : finded){//遍历数组,f表示每个数组元素，这里使用了for..in语句
            if(f == wuqi){//如果某个数组元素和wuqi的长度相同，
                return true;//直接返回true，表示wuqi就是三把可以召唤的武器中的一把
                //这里使用return，就是直接终止循环，不用再循环查找了。
            }
        }
        return false;//整个循环都已经比较完成了，还是没有发现，就表示这把武器（wuqi）不是我们搜索到的可召唤武器
    }
}
