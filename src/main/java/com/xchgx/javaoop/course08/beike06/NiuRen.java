/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.beike06;

/**
 *
 * @author Administrator
 */
public class NiuRen implements  Driver,Racer,Teach{

    @Override
    public void kaiche() {
        System.out.println("牛人在开车");
    }

    @Override
    public void racing() {
        System.out.println("牛人在飙车");
    }

    @Override
    public void teaching() {
        System.out.println("牛人在讲课");
    }
    
}
