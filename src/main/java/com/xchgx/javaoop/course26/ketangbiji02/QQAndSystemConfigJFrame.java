/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course26.ketangbiji02;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

/**
 * 案例-系统设置窗体
 *
 * @author 陈老师 现代管理学院
 */
public class QQAndSystemConfigJFrame extends JFrame {
    public QQAndSystemConfigJFrame() throws HeadlessException {
        initWindow();
        start();
    }
    private void initWindow() {
        setTitle("系统设置窗体");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 300);
    }
    private void start() {
        JLabel titleLabel = new JLabel("软件系统设置",JLabel.CENTER);//标题
        titleLabel.setPreferredSize(new Dimension(200, 50));//设置标题标签组件的尺寸
        
        JTabbedPane tab = new JTabbedPane();//标签容器
        //第1个中间层容器 账号设置,强制更改边框布局
        JPanel p1 = new JPanel(new BorderLayout());
        JLabel tongyongLabel = new JLabel("通用");
        tongyongLabel.setVerticalAlignment(JLabel.TOP);
        //添加右侧的多个组件
        JPanel p1Right = new JPanel(new GridLayout(6, 1));//网格10x1布局
        p1Right.add(new JCheckBox("开启新信息提醒声音",true));//添加个已经勾选的多选框组件
        p1Right.add(new JCheckBox("开启语音和视频通话提醒声音",true));//添加个已经勾选的多选框组件
        p1Right.add(new JCheckBox("有更新时自动升级微信",true));//添加个已经勾选的多选框组件
        p1Right.add(new JCheckBox("开机自启动微信",false));
        p1Right.add(new JButton("清空聊天记录(3.3G)"));
        JComboBox cbx = new JComboBox();//下拉组件
        cbx.addItem("简体中文");
        cbx.addItem("英文");
        cbx.addItem("繁体中文");
        p1Right.add(cbx);
        
        p1.add(tongyongLabel,"West");//左边的标题添加完成
        p1.add(p1Right,"Center");//中间加入p1Right容器
        
        
        initP2();//初始化P2容器
        
        tab.add("账号设置", p1);
        tab.add("通用设置", p2);
        
        getContentPane().add(titleLabel,BorderLayout.NORTH);//加入到窗体中显示
        getContentPane().add(tab);//加入到窗体中显示
    }
    private void initP2(){
        p2 = new JPanel(new GridLayout(3,1));//第2个中间层容器 通用设置
        JPanel pp1 = new JPanel(new GridLayout(2, 1));
        pp1.setBorder(BorderFactory.createTitledBorder("搜索内容"));
        pp1.add(new JRadioButton("在搜索的位置搜索文件名和内容"));
        pp1.add(new JRadioButton("在搜索的位置搜索文件名和内容"));
        JPanel pp2 = new JPanel();
        JPanel pp3 = new JPanel();
        
        p2.add(pp1);
        p2.add(pp2);
        p2.add(pp3);
    }
    JPanel p2;
    public static void main(String[] args) {
        new QQAndSystemConfigJFrame().setVisible(true);
    }
}
