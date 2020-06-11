/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course22.beike01;

import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * 金闪闪窗体类，自定义的窗体类。 继承JFrame类，就可以得到所有的属性和方法。
 *
 * @author 陈老师 现代管理学院
 */
public class Jinshanshan extends JFrame {

    //将标签组件提升为成员属性。
    public JLabel jLabel = new JLabel("文本说明", JLabel.CENTER);//创建标签组件//给标签设置文本内容
    private Manager manager = new Manager();//创建一个实例化的manager对象，它会跟随金闪闪窗体内同时创建，不会重复。

    public Jinshanshan() throws HeadlessException {//创建对象的同时，执行构造器中的代码

    }

    //要调用窗体类的方法，你就一定要先创建一个方法，在方法内调用
    public void init() {//声明（定义）了一个初始化init的方法。
        setTitle("统计山寨金闪闪");//设置窗体的标题
        setSize(400, 500);//宽度400， 高度500像素
        setLocationRelativeTo(null);//屏幕垂直，水平居中
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//点击关闭按钮时，退出程序
        //这里不要写显示窗体(setVisible(true))的代码
        setLayout(null);
    }

    public void initJMenu() {//初始化菜单内容
        //n个王之财宝（一级菜单）->产生n把武器（菜单项）
        JMenuBar bar = new JMenuBar();//创建菜单栏
//        菜单栏中，添加菜单的（一般不添加菜单项
        JMenu menu = new JMenu("人物");//创建菜单对象（一级菜单）
        JMenuItem menuItem = new JMenuItem("金闪闪");//创建菜单项
        menu.add(menuItem);//1、先通过菜单，把菜单项加入到菜单中
        bar.add(menu);//2、再使用菜单栏，将菜单添加进来。

        JMenu wuqiMenu = new JMenu("n个王之财宝");//创建菜单对象（一级菜单）
        JMenuItem madeWuqiItem = new JMenuItem("产生n把武器");//随机生成n把武器
//        madeWuqiItem.addActionListener(new ActionListener());//接口是不能new实例化的。
        JLabelActionListener jLabelActionListener = new JLabelActionListener(jLabel, manager);//创建自定义的事件监听器实现类对象
        madeWuqiItem.addActionListener(jLabelActionListener);//当你单击“我”时，就触发监听器的 actionPerformed 方法

        wuqiMenu.add(madeWuqiItem);//通过菜单添加菜单项
//        wuqiMenu.add(new JMenuItem("武器18号"));
//        wuqiMenu.add(new JMenuItem("武器20号"));
//        wuqiMenu.add(new JMenuItem("武器11号"));
//        wuqiMenu.add(new JMenuItem("武器23号"));
//        wuqiMenu.add(new JMenuItem("武器13号"));
//        wuqiMenu.add(new JMenuItem("武器30号"));
        bar.add(wuqiMenu);//把武器菜单加入到菜单栏中

        JMenu kerenMenu = new JMenu("客人");
        JMenuItem item = new JMenuItem("随机抽取区间");
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] randomExtract = manager.randomExtract();
                getContentPane().removeAll();

                JPanel pane = new JPanel();
                for (int i = 0; i < randomExtract.length; i++) {
                    int j = randomExtract[i];
                    JButton button = new JButton("武器" + j + "号");
                    button.setBackground(Color.GREEN);
                    pane.add(button);
                }
                pane.setBounds(4, 40, getWidth(), getHeight());
                getContentPane().add(pane);
                pane.revalidate(); //刷新
            }
        });
        kerenMenu.add(item);
        bar.add(kerenMenu);

        setJMenuBar(bar);//3、最后才把一切都准备就绪的菜单栏设置为窗体菜单。
    }

    public void initJLabel() {//初始化标签组件
        jLabel.setBounds(5,100,getWidth(),40);
        getContentPane().add(jLabel);//将标签加入到窗体的顶层容器中，让它可以显示 
    }
}
