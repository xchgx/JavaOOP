/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course20.ketangbiji01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * 事件监听器，是我们通过实现ActionListener接口得到的类
 * @author 陈老师 现代管理学院
 */
public class JLabelActionListener implements ActionListener{
    //这里只是创建一个引用，不要实例化，我们需要等待调用者传递真正的标签对象进来
    private JLabel jLabel;

    public JLabelActionListener(JLabel jLabel) {//创建一个带参数的 构造器
        //要求调用者把主窗体的标签组件对象传入进来。
        this.jLabel = jLabel;//我拿到了金闪闪主窗体中的标签组件
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "你点击了一个有单击事件的菜单项");//弹出对话框
        //对标签组件的内容进行重写。
        jLabel.setText("武器18号,武器19号,武器20号"); 
        
    }

}
