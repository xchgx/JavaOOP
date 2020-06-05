/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course18.ketangbiji04;

/**
 * 自定义的语法异常类
 * @author 陈老师 现代管理学院
 */
public class GrammarException extends Exception{//继承Exception异常类
    public  int row;//第几行出现问题
    public int column;//一行中的第几个单词出现了问题
    public String word;//出错的单词是什么
    public GrammarException(int row,int column, String word, String str) {
        super(str);
        this.row = row;
        this.column = column;
        this.word = word;
    } 
}
