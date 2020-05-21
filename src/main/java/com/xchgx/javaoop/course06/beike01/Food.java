/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Food {
    private int hp;//恢复值
    private String name;//食品名称

    public Food(int hp, String name) {
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
