/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course20.beike01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class LabelActionListener implements ActionListener{
    private JLabel label;

    public LabelActionListener(JLabel label) {
        this.label = label;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem wuqi = (JMenuItem) e.getSource();
        if(wuqi.getText().equals("随机n个武器")){
            String number = JOptionPane.showInputDialog(null, "请输入n个武器的具体数量：");
//            String number = JOptionPane.showInputDialog(null, "请输入n个武器的具体数量：", "输入武器数量", JOptionPane.QUESTION_MESSAGE);
            int n = Integer.parseInt(number);
            String result = "<html>";
            for (int i = 0; i < n  ; i++) {
                int r = (int)(Math.random()*10)+1;
                result += "武器"+r+"号<br>"; 
            }
            result+="</html>";
            label.setText(result);
        }
    } 
}
