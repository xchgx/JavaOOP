/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.ketangbiji03;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Meat {//肉类
    private int hp;//提供的回复量
    private String name;//名称

    public Meat() {
        hp = 30;
        name = "牛肉";
    }

    public Meat(int hp, String name) {
        this.hp = hp;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
