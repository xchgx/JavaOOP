/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course25.ketangbiji01;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class JLabelJFrame extends JFrame{

    public JLabelJFrame() throws HeadlessException {//构造方法
        initWindow();
        start();//一旦经过new操作符，这个方法就会自动运行
    }
    private void initWindow(){//对窗体的初始化设置
        setTitle("标签组件的使用");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null); 
    }
    private void start(){
        JLabel b1 =new JLabel("大家好");//创建文本类型的标签组件对象
        b1.setVerticalAlignment(JLabel.BOTTOM);//垂直方向为居下
        JLabel b2 =new JLabel("我是标签组件",JLabel.RIGHT);//创建居中对齐的标签对象 CENTER:居中,RIGHT:居右
        ImageIcon icon = new ImageIcon("D:\\tupian.png");//创建图片对象
        JLabel b3 = new JLabel("头像可更换", icon, JLabel.CENTER);//创建带有图片的标签
        //创建中间层面板容器,并使用网格布局管理器，网格为2行1列的布局。
        JPanel panel = new JPanel(new GridLayout(3, 1));//使用网格管理器
        panel.add(b1);//先加入b1标签对象，该对象将会出现在(1,1)网格中
        panel.add(b2);//再加入b2标签对象，该对象将会出现在(2,1)网格中
        panel.add(b3);//最后加入b3标签对象，该对象将会出现在(3,1)网格中
        //接下来，要把中间层容器panel对象，放入到顶层容器中
        //获得顶层容器的方法是 getContentPane()
        getContentPane().add(panel);//将已经放入2个标签组件的中间层容器放入到顶层容器中 
        pack();//自动缩小到组件的合适大小
    }
    public static void main(String[] args) {
        new JLabelJFrame().setVisible(true);//直接实例化该对象，并调用显示窗体方法
    }
}
