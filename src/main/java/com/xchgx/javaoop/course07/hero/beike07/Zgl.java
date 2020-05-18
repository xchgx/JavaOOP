/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.hero.beike07;

/**
 *
 * @author 陈老师 [现代管理学院]
 */
public class Zgl {//诸葛亮
    private int hp;//血量
    private String name;//名称
    private  int gj;//攻击力

    public Zgl() {
        this.hp = 50;
        this.name = "诸葛亮";
        this.gj = 20;
    }
  
    //以下内容为工具提供的模版代码
    public Zgl(int hp, String name, int gj) {
        this.hp = hp;
        this.name = name;
        this.gj = gj;
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

    public int getGj() {
        return gj;
    }

    public void setGj(int gj) {
        this.gj = gj;
    }

    @Override
    public String toString() {
        return "诸葛亮{" + "hp=" + hp + ", name=" + name + ", gj=" + gj + '}';
    }
    
    
}
