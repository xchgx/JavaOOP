/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.hero.beike07;

/**
 * 加入了血量
 *
 * @author 陈老师 [现代管理学院]
 */
public class GameStart2 {

    public static void main(String[] args) {//单纯的输出，没有变量，无法计算血量
        System.out.println("游戏开始...");  
       Drj drj = new Drj();
       Zgl zg = new Zgl();
       drj.attack(zg);
       System.out.println("游戏结束");
    }
}
