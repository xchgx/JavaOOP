/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course15.beike02;

/**
 * 留言数据类
 * @author 陈老师 现代管理学院
 */
public class Liuyan {
    private String name;//留言人姓名
    private int count; //留言次数

    public Liuyan() {
    }

    public Liuyan(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
