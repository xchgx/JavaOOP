/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course20.beike01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JFrameJMenu extends JFrame {

    public JMenuBar jMenuBar;
    private JLabel label;

    /**
     * 初始化设置
     */
    public void init() {
        setTitle("统计山寨金闪闪");
        setSize(400, 400);
//        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void initJMenuBar() {
        jMenuBar = new JMenuBar();
        JMenu playMenu = new JMenu("人物");
        playMenu.add(new JMenuItem("红A"));
        playMenu.add(new JMenuItem("客人"));
        playMenu.add(new JMenuItem("金闪闪"));
        jMenuBar.add(playMenu);

        JMenu caibaoMenu = new JMenu("n个王之财宝");
        JMenuItem wuqi = new JMenuItem("随机n个武器");

        wuqi.addActionListener(new LabelActionListener(label));

        caibaoMenu.add(wuqi);
        caibaoMenu.add(new JMenuItem("武器10号"));
        caibaoMenu.add(new JMenuItem("武器11号"));
        caibaoMenu.add(new JMenuItem("武器12号"));
        caibaoMenu.add(new JMenuItem("武器13号"));
        caibaoMenu.add(new JMenuItem("武器14号"));
        caibaoMenu.add(new JMenuItem("武器15号"));
        caibaoMenu.add(new JMenuItem("武器18号"));
        caibaoMenu.add(new JMenuItem("武器20号"));
        jMenuBar.add(caibaoMenu);

        JMenu maijiaMenu = new JMenu("卖家店主");
        maijiaMenu.add(new JMenuItem("开专卖店"));
        maijiaMenu.add(new JMenuItem("摆摊（武器摆一排）"));
        jMenuBar.add(maijiaMenu);

        JMenu kerenMenu = new JMenu("m个客人");
        kerenMenu.add(new JMenuItem("随机抽取区间l,r"));
        kerenMenu.add(new JMenuItem("区间武器召唤"));
        kerenMenu.add(new JMenuItem("武器归还"));
        jMenuBar.add(kerenMenu);

        JMenu guizeMenu = new JMenu("规则");
        guizeMenu.add(new JMenuItem("那三件武器"));
        guizeMenu.add(new JMenuItem("首尾相接"));
        guizeMenu.add(new JMenuItem("召唤山寨金闪闪"));
        jMenuBar.add(guizeMenu);

        JMenuItem about = new JMenuItem("关于我们");
        jMenuBar.add(about);
//         about.add(new JButton("asdf"));
//         about.add(jMenuBar);
        setJMenuBar(jMenuBar);
    }

    public void initJLabel() {
        label = new JLabel("文本说明", JLabel.CENTER);
        getContentPane().add(label);//获得顶层容器对象并添加标签组件。
    }
}
