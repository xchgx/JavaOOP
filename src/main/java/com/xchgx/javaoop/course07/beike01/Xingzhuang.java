/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.beike01;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public abstract class Xingzhuang {//抽象类，谁让我有抽象方法呢。
    private  String name; //形状名称 
    public abstract double clacArea();//你怎么计算，我不管了，谁继承我谁负责计算面积

    /**
     * 需要告诉我你是什么形状
     * @param name 
     */
    public Xingzhuang(String name) {
        this.name = name;
    }
    //以下是标准的getter和setter模版代码。。不是我写的。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    } 
}
