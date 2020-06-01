/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course16.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard identityCard = new IdentityCard("000000100000000000");
        System.out.println("identityCard.isIdCard() = " + identityCard.isIdCard());
        String analysisSheng = identityCard.analysisSheng();
        System.out.println("analysisSheng = " + analysisSheng);
        String analysisBirthday = identityCard.analysisBirthday();
        System.out.println("analysisBirthday = " + analysisBirthday);
        
        String show = identityCard.show();
        System.out.println("show = " + show);
        
    }
}