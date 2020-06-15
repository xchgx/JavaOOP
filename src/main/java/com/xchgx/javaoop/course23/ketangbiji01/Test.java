/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course23.ketangbiji01;

/**
   测试召唤算法
 * @author Administrator
 */
public class Test {
    public static boolean zhaohuan(int a,int b,int c){
//        if(a+b>c && b+c>a && c+a>b){
//            return true;
//        }else{
//            return false;
//        }
        if(a+b<=c){
            return false;//不是三角形，召唤失败
        }
        if(b+c<=a){
            return false;//不是三角形，召唤失败
        }
        if(c+a<=b){
            return false;//不是三角形，召唤失败
        }
        return true;//符合召唤规则，召唤成功
    }
    public static void main(String[] args) {
        int[] arr = {11,12,25,10};//随机抽取到的区间
        boolean result = zhaohuan(arr[0], arr[1], arr[3]);
        if(result){
            System.out.println("召唤金闪闪成功，亮闪闪的完美无缺的金闪闪出现了。");
        }else{
            System.out.println("召唤金闪闪失败，一个破烂的金闪闪掉在了地上，摔碎了。");
        }
    }
}
