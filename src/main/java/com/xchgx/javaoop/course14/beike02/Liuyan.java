/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course14.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Liuyan {
    private String name;//姓名
    private int count;//次数

    public void jiajia(){//留言次数 加1
        this.count ++ ;
    }
    
    //下面是自动生成的代码。
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
