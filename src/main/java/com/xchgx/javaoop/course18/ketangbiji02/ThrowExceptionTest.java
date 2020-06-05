/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji02;

/**
 * 测试产生异常向外抛出
 * @author 陈老师 现代管理学院
 */
public class ThrowExceptionTest {
    public static void main(String[] args) {//属于系统的边界
        ThrowException te = new ThrowException();
        try{
            te.madeException();//这一行代码出现了异常
        }catch(Exception e){
            System.out.println("异常信息："+e.getMessage());
        }
        
        try{
            te.madeInException();//不影响后面的代码执行
        }catch(Exception e){
            System.out.println("异常信息："+e.getMessage());
        }
    }
}
