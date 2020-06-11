/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course22.beike01;

/**
 * 测试金闪闪窗体
 * @author 陈老师 现代管理学院
 */
public class JinshanshanTest {
    public static void main(String[] args) {//主方法
        Jinshanshan jss = new Jinshanshan();
        jss.init();//调用金闪闪类对象的初始化方法，让窗体拥有正常的窗体样式
        jss.initJMenu();//先初始化菜单功能后，再执行下面的显示
        jss.initJLabel();//初始化标签组件
        jss.setVisible(true);//在这里显示窗体，不要在设置中显示窗体
    }
}
