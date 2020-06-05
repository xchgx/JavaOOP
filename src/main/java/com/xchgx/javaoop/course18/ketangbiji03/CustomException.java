/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji03;

/**
 * 我们定义了一个异常类（自定义的异常类），要继承Exception
 * @author 陈老师 现代管理学院
 */
public class CustomException extends Exception{

    public CustomException(String str) {//创建一个带参数的构造方法
        //但是该参数并不是传给自己的属性
        super(str);
    }
    
}
