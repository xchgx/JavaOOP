/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course07.hero.beike08;

/**
 * 提炼为面向对象
 *
 * @author 陈老师 [现代管理学院]
 */
public class GameStart3 {

    public static void main(String[] args) {//单纯的输出，没有变量，无法计算血量
       System.out.println("游戏开始...双方阵容：狄仁杰 VS 诸葛亮+程咬金");  
       Drj drj = new Drj();//狄仁杰
       Zgl zg = new Zgl();//诸葛亮
       Cyj cyj = new Cyj();//程咬金
       for(int i=0; i<10; i++){
        drj.attack(zg);
        drj.attack(cyj);
        zg.attack(drj);
        cyj.attack(drj);
           System.out.println("\t-----战况：狄仁杰 HP="+drj.getHp()+", 诸葛亮: HP="+zg.getHp()+" ------");
       }
       System.out.println("游戏结束");
    }
}
