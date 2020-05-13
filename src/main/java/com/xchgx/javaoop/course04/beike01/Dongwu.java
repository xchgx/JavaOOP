/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.beike01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Dongwu {//动物 
    private String name;//名称 
    public void jiao(){ 
        System.out.println("叫声");
    }
    public void move(){
        System.out.println("移动");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
