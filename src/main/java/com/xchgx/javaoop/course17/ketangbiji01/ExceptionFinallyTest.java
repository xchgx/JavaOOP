/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course17.ketangbiji01;

/**
 * 对finally的特点进行测试
 * @author 陈老师 现代管理学院
 */
public class ExceptionFinallyTest {
    public static void main(String[] args) {
        //break; 退出最近的循环，只能跳出1层循环
        //continue; 继续循环
        //return; 返回
        try{
            System.out.println("进入到异常捕获区域");
            int a = 5/1;//没有报异常，代码会继续执行
            return; //方法返回了，结束了,这里既执行了返回，又执行了finally语句块
        }catch(Exception e){//捕获异常
            System.out.println("发现异常 "+e);
        }finally{
            System.out.println("清道夫的工作");
        }
        return;
    }
}
