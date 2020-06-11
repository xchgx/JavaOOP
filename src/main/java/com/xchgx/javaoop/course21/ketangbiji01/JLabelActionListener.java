/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course21.ketangbiji01;

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
    private Manager manager;//创建Manager类的引用，这里不要实例化（不要new），这里只是指向获得传入进来的Manager实例

    public JLabelActionListener(JLabel jLabel,Manager manager) {//创建一个带参数的 构造器
        //要求调用者把主窗体的标签组件对象传入进来。
        this.jLabel = jLabel;//我拿到了金闪闪主窗体中的标签组件
        this.manager = manager;//接收传入进来的manager实例对象
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {//当我们点击菜单项-产生n把武器 时，会自动触发执行该方法
//        JOptionPane.showMessageDialog(null, "你点击了一个有单击事件的菜单项");//弹出对话框
        //对标签组件的内容进行重写。
//        jLabel.setText("武器18号,武器19号,武器20号"); 
        //产生n把武器，
        int[] madeNwuqi = manager.madeNwuqi(10);
        String result = "<html>";//创建标签文本内容字符串，采用html格式
        for (int i = 0; i < madeNwuqi.length; i++) {
            int j = madeNwuqi[i];
            result += "武器"+j+"号<br>";//<br>换行的意思
        }
        result += "</html>";//最后添加结束标签
        jLabel.setText(result);//把前面准备好的字符串放入到标签文本中
    }

}
