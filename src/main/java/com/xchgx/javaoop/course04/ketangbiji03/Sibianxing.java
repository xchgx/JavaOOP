/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course04.ketangbiji03;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Sibianxing extends Xingzhuang{//四边形 继承 形状类

    @Override
    public void draw() {//    重写draw
        for(int i=0; i<5;i++){
            System.out.println("********");
        }
    }
}
