/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.ketangbiji01;

/**
 * 数据类 留言
 * @author Administrator
 */
public class Liuyan {//留言类（数据类）
    private String name;//姓名
    private int count;//统计留言次数
    //下面的代码由工具生成
    //带参数的构造器、getter和setter

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
