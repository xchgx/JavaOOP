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
public class Test {
    public static void main(String[] args) {
        驾驶员 jsy = new 司机();
        jsy.开车();
        赛车手 scs = new 寒寒();
        scs.飙车();
        讲师 js = new 陈老师();
        js.讲课();
        
        牛人 niu = new 牛人();//创建牛人类的对象
        讲师 js2 = niu;//这时候js2就指向了niu对象
        赛车手 scs2 = niu;
        驾驶员 jsy2 = niu;
        js2.讲课();
        scs2.飙车();
        jsy2.开车();
    }
}
