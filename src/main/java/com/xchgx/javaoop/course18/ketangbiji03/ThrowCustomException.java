/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji03;

/**
 * 抛出自定义异常
 * @author 陈老师 现代管理学院
 */
public class ThrowCustomException {
    public void throwCustom() throws CustomException{//这个方法就是用来抛出自定义异常的
        throw new CustomException("这是自定义异常");//这里就是产生并抛出异常的代码
    }
    public void setScore(int score) throws CustomException{//设置分数的方法  
        if(score <0 || score > 100){
            throw new CustomException(score+"这不是合法的分数");
        }
        System.out.println("该分数为："+score);
    }
}
