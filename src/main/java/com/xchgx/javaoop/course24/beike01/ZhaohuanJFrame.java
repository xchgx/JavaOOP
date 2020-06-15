/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course24.beike01;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 召唤窗体类
 *
 * @author 陈老师 现代管理学院
 */
public class ZhaohuanJFrame extends JFrame {

    private Manager manager = new Manager();
    private ArrayList<Integer> zhaohuanReady = new ArrayList<>();
    private JPanel panel;
    private JButton btn;
    private int jssCount = 0;

    public ZhaohuanJFrame() throws HeadlessException {//构造器
        initWindow();//在构造器中调用初始化窗体的方法
        manager.madeNwuqi(20);//产生n把武器-王之财宝
    }

    private void initWindow() {
        setTitle("王之财宝");//设置标题
        setSize(400, 500);//设置尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置退出方式
        setLocationRelativeTo(null);//设置位置居中 
        setLayout(null);//取消默认的布局管理器，由程序员控制
        panel = new JPanel();//创建中间层容器，用来对方组件
        panel.setBackground(Color.blue);//设置面板容器的背景色为红色
        panel.setBounds(0, 35, getWidth(), getHeight());//从左上角开始，占满整个主窗体
        btn = new JButton("随机抽取区间武器");//创建按钮，并设置文本内容
        btn.addActionListener(new ActionListener() {//匿名内部（实现）类
            @Override
            public void actionPerformed(ActionEvent e) { //单击事件触发的方法
                //随机抽取区间,这里一定要调用Manager对象了
                int[] wuqis = manager.randomExtract(4);//随机抽
                int[] finded = manager.findTriangle(wuqis);
//                System.out.println("finded.length = " + finded.length);
                panel.removeAll();//把容器中的所有组件都删除。
//                JPanel p = new JPanel();
                for (int i = 0; i < wuqis.length; i++) {
                    int wq = wuqis[i];
                    JButton b = new JButton("武器" + wq + "号");
                    if (manager.findedContain(finded, wq)) {//如果是三角形的一把就，设置为绿色背景
                        b.setBackground(Color.PINK);
                    }
                     
                    b.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            JButton button = (JButton) e.getSource();
//                            button.setFont(new Font("宋体", 0, 20));
                            button.setEnabled(false);   
                            button.setText(wq + "号 就绪");
                            zhaohuanReady.add(wq);
                            if (zhaohuanReady.size() == 3) {
                                zhaohuanStart();
                            }
//                            JOptionPane.showMessageDialog(null, wq);
                        }
                    });
                    panel.add(b);
                }
//                panel.add(p);//添加到中间层面板中
                panel.revalidate();//刷新
            }
        });
        btn.setBounds(0, 0, getWidth(), 30);//设置按钮的尺寸和位置
        getContentPane().add(btn);//把按钮加入到顶层容器中
        getContentPane().add(panel);//面板容器准备就绪后，加入到顶层容器中
    }

    public void zhaohuanStart() {
//        Component[] components = panel.getComponents();
//        for(Component com : components){
//            panel.remove(com);
////            panel.revalidate();
//        }
        panel.removeAll();
        if (manager.zhaohuan(zhaohuanReady.remove(0), zhaohuanReady.remove(0), zhaohuanReady.remove(0))) {
            panel.setBackground(Color.green);
            panel.add(new JLabel("恭喜你，成功召唤出山寨金闪闪一枚。 +1"));
            jssCount++;
            btn.setText("随机抽取区间武器(已召唤 " + jssCount + " 个山寨金闪闪)");
        } else {
            panel.setBackground(Color.red); 
            panel.add(new JLabel("哦，抱歉，您召唤失败了！"));
        }
//         panel.revalidate(); 
        panel.repaint();
    }

    public static void main(String[] args) {//主方法
        ZhaohuanJFrame wq = new ZhaohuanJFrame();//实例化窗体类对象
        wq.setVisible(true);//显示窗体
    }
}
