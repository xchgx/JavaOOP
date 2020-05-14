/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.beike04;

import com.xchgx.javaoop.course04.beike03.*;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class 王者英雄 {
    private String heroname;//英雄名字
    private String jineng1Name;//技能一名称
    public 王者英雄() {
    }

    public 王者英雄(  String heroname, String jineng1Name) {
        this.heroname = heroname;
        this.jineng1Name = jineng1Name;
    } 
    
    public void jineng1(王者英雄 hero){
        System.out.println(heroname +"使用 技能一:"+jineng1Name+",攻击 "+hero.heroname);
    } 
}
