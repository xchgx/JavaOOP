/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji02;

/**
 * 测试抛出异常
 * @author 陈老师 现代管理学院
 */
public class ThrowCatchExceptionTest {
    public static void main(String[] args) {//不要把错误抛到用户的面前。
        ThrowException te = new ThrowException();
        try{
            te.madeException();
            te.madeInException();
        }catch(Exception e){
            System.out.println("异常信息："+e.getMessage());
        }
    }
}
