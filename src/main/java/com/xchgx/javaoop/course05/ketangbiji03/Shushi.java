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
public class Shushi { //熟食类
    private  int hp;//提供的回复量    
    private String name;//熟食的名称
    public Shushi() {
        hp = 20;//默认
        name = "鸡腿";//默认名字
    }
  //下面的代码是自动生成的 ALt+Insert 选择getter setter
    public Shushi(int hp, String name) {
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
