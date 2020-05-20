/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course08.ketangbiji02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class 牛人 implements 驾驶员,赛车手,讲师{

    @Override
    public void 开车() {
        System.out.println("牛人 在开着小汽车");
    }
    //Ctrl + E 删除整行
    @Override
    public void 飙车() {
        System.out.println("牛人 在飙车");
    }

    @Override
    public void 讲课() {
        System.out.println("牛人 在讲课");
    }

}
