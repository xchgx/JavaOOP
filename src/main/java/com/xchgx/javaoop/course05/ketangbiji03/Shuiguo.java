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
public class Shuiguo {//水果类:苹果、柠檬、西瓜
    private int hp;//不是水果的血量，而是水果提供的恢复值
    private String name;//水果的名称
    
    public Shuiguo() {
        hp= 10;//默认
        name = "苹果";
    }
  //下面的代码是自动生成的 ALt+Insert 选择getter setter
    public Shuiguo(int hp,String name) {
        this.hp = hp;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
}
