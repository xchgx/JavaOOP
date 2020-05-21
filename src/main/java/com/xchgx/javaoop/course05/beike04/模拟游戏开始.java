/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.beike04;

import com.xchgx.javaoop.course04.beike03.*;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class 模拟游戏开始 {
    public static void main(String[] args) {
        王者英雄 hero1 = new 狄仁杰("逮捕令");
        王者英雄 hero2 = new 诸葛亮("元气弹");
        hero1.jineng1(hero2);
        hero2.jineng1(hero1);
    }
}
