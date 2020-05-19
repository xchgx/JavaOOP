/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji07;

/**
 * 所有英雄角色的父类
 * @author Administrator
 */
public abstract class 英雄 {//王者英雄父类，所有的角色的公共结构
    private int hp;//血量
    private String name; //名称
    private int gj;//攻击力
    public void attack(英雄 hero){//普通攻击，由父类负责，技能攻击由子类负责
        //你想管所有子类的行为，那么就在父类中写实现代码
        //如果你不想管，就改成抽象方法。让子类去折腾
        System.out.println(this.name+"攻击了"+hero.getName()+"，造成伤害 "+this.gj);
        int newHp = hero.getHp()-gj;
        hero.setHp(newHp);
    }
    public abstract void jineng(英雄 hero);//技能是抽象方法由子类实现
    
    //下面的代码是通过 插入代码 功能实现的。

    public 英雄() {
    }

    public 英雄(int hp, String name, int gj) {
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
    
}
