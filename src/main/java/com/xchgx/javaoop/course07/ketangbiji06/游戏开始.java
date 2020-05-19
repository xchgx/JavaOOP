/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.ketangbiji06;

/**
 * 诸葛亮 vs 狄仁杰
 * @author Administrator
 */
public class 游戏开始 {//相当于我们一直都在编写的Test类-测试类
    public static void main(String[] args) {
        System.out.println("游戏开始...诸葛亮 VS 狄仁杰");
        //战斗过程 
        //面向对象分析，英雄(Hero):血量、攻击力、名称
        //诸葛亮是不是英雄？ 狄仁杰是不是英雄
        // 我们希望新加入的英雄可以直接参与战斗，而不用重新修改战斗代码。
        诸葛亮类 zg = new 诸葛亮类();
        狄仁杰类 dj = new 狄仁杰类();
//        程咬金类 cyj = new 程咬金类();//
        zg.attack(dj);//诸葛亮 攻击 狄仁杰
        dj.attack(zg);//狄仁杰 攻击 诸葛亮
        System.out.println("游戏结束");
    }
}
