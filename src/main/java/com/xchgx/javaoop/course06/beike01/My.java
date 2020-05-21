/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.beike01;

import com.xchgx.javaoop.course05.ketangbiji03.*;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class My {//我
    private int hp;//血量
    
    public My() {//默认构造
        hp = 100;//设置默认值100
    }
    
    public My(int hp) {//有参构造
        this.hp = hp;
    } 
    
    
    public void eatting(Food food){//吃食物
        this.hp+=food.getHp();
        System.out.println("我吃了一个"+food.getName()
                +",恢复了 +"+food.getHp());
    }   
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    } 
}
