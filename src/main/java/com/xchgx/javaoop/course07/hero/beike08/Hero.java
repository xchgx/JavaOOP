/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.hero.beike08;

/**
 *
 * @author Administrator
 */
public class Hero {
    private int hp;//血量
    private String name;//名称
    private  int gj;//攻击力

    public Hero(int hp, String name, int gj) {
        this.hp = hp;
        this.name = name;
        this.gj = gj;
    }
    
    
    public void attack(Hero hero){//计算输出伤害
        int newsHp = hero.getHp()-gj;//计算对方的新血量
        hero.setHp(newsHp); //设置对方的新血量
        System.out.println(name+"攻击"+hero.getName()+",造成"+gj+"点伤害");
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
    
}
