/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course06.ketangbiji01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Mianbao extends Food{//面包类

    public Mianbao() {//提供默认值
        super(33, "毛毛虫面包");
    }
    public Mianbao(int hp, String name){//可以自定义面包的hp和name
        super(hp, name);
    }
    
}
