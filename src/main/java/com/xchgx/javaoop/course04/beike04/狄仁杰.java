/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.beike04;
 

/**
 *
 * @author 陈老师 现代管理学院
 */
public class 狄仁杰 {
    private  String heroname = "狄仁杰";//英雄名称
    private String jineng1Name;//技能一名称

    public 狄仁杰(String jineng1Name) {
        this.jineng1Name = jineng1Name;
    }

    
    public void jineng1(诸葛亮 hero){
        System.out.println(heroname +"使用 技能一:"+jineng1Name+",攻击 "+hero.getHeroname());
    } 

    public String getHeroname() {
        return heroname;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }

    public String getJineng1Name() {
        return jineng1Name;
    }

    public void setJineng1Name(String jineng1Name) {
        this.jineng1Name = jineng1Name;
    }
    
    
}
