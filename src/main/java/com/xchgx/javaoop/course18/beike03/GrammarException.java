/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course18.beike03;

/**
 * 语法问题
 *
 * @author 陈老师 现代管理学院
 */
public class GrammarException extends Exception {

    public int row;
    public int column;
    public String word;

    public GrammarException(int row, int column, String word, String str) {
        super(str);
        this.row = row;
        this.column = column;
        this.word = word;
    }

    @Override
    public String toString() {
        return "行：" + row + "\n"
                + "列：" + column + "\n"
                + "当前单词：" + word + "\n"
                + "异常消息：" + super.getMessage();
    }

}
