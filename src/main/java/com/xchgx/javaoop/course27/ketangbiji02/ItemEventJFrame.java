/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course27.ketangbiji02;

import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * 状态切换（改变）事件
 *
 * @author 陈老师 现代管理学院
 */
public class ItemEventJFrame extends JFrame {

    public ItemEventJFrame() throws HeadlessException {
        initWindow();//调用初始化窗体设置
        start();
    }

    private void initWindow() {//初始化窗体设置
        setTitle("状态改变事件");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLocationRelativeTo(null);
    }

    private void start() {
        JCheckBox checkBox = new JCheckBox("使用加速SSVVIP服务(免费体验30秒).");
        checkBox.addItemListener(new ItemListener() {//匿名实现类 new后创建的对象
            @Override
            public void itemStateChanged(ItemEvent e) {
                int stateChange = e.getStateChange();
                System.out.println("stateChange = " + stateChange);
                JCheckBox source = (JCheckBox)e.getSource();//事件源（事件产生的源头），在这里产生该事件的是checkBox对象
                boolean selected = source.isSelected(); //获得当前组件的选中的状态
                System.out.println("当前组件的状态是: " + selected);
                        
            }
        });
        getContentPane().add(checkBox,"North");
    }

    public static void main(String[] args) {
        new ItemEventJFrame().setVisible(true);
    }
}
