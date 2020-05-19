/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji07;

/**
 * 诸葛亮 vs 狄仁杰
 * @author Administrator
 */
public class 游戏开始 {//相当于我们一直都在编写的Test类-测试类
    public static void main(String[] args) {
        System.out.println("游戏开始...诸葛亮 VS 狄仁杰"); 
        英雄 hero1 = new 诸葛亮类();
        英雄 hero2 = new 狄仁杰类();
        for(int i=0; i<10; i++){
            hero1.attack(hero2);
            hero2.attack(hero1);
            System.out.println(" \t 战况：诸葛亮HP="+hero1.getHp()+",狄仁杰的HP="+hero2.getHp());
        }
        System.out.println("游戏结束");
    }
}
