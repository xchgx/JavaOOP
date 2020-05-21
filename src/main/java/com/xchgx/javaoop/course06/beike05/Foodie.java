/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.beike05;

import com.xchgx.javaoop.course05.beike03.*;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Foodie { //吃货类
    private String name="我";
    private long hp=10;
    
    public void eating(Shuiguo shuiguo){//水果
        this.hp += shuiguo.getHp();
        System.out.println(name + "吃了一个:"+shuiguo.getName()+", hp:+"+shuiguo.getHp());
    }
    public void eating(Shushi shushi){//熟食
        this.hp += shushi.getHp();
        System.out.println(name + "吃了一个:"+shushi.getName()+", hp:+"+shushi.getHp());
    }

    @Override
    public String toString() {
        return name + "还剩 "+hp+"点血量！";
    }
 
}
