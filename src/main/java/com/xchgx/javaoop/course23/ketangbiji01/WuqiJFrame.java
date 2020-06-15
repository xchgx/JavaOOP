/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course23.ketangbiji01;

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
 * 武器窗体类 
 * @author 陈老师 现代管理学院
 */
public class WuqiJFrame extends JFrame{
    private Manager manager = new Manager();
    private int count = 0;//统计选择召唤武器的次数。过时了
    private ArrayList<Integer> list = new ArrayList<>();//创建用来记录保存选中武器的动态数组
    private JPanel panel;//提升用来显示随机抽区间按钮的中间面板容器变量为成员属性.
    public WuqiJFrame() throws HeadlessException {//构造器
        initWindow();//在构造器中调用初始化窗体的方法
        manager.madeNwuqi(20);//产生n把武器-王之财宝
    }
    private  void initWindow(){
        setTitle("王之财宝");//设置标题
        setSize(400,500);//设置尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置退出方式
        setLocationRelativeTo(null);//设置位置居中 
        setLayout(null);//取消默认的布局管理器，由程序员控制
        panel = new JPanel();//创建中间层容器，用来对方组件
        panel.setBackground(Color.red);//设置面板容器的背景色为红色
        panel.setBounds(0, 35, getWidth(), getHeight());//从左上角开始，占满整个主窗体
        JButton btn = new JButton("随机抽取区间武器");//创建按钮，并设置文本内容
        btn.addActionListener(new ActionListener() {//匿名内部（实现）类
            @Override
            public void actionPerformed(ActionEvent e) { //单击事件触发的方法
                //随机抽取区间,这里一定要调用Manager对象了
                int[] wuqis = manager.randomExtract(4);//随机抽
                panel.removeAll();//把容器中的所有组件都删除。
                JPanel p = new JPanel();
                for(int i=0; i<wuqis.length; i++){
                    int wq = wuqis[i];
                    JButton b = new JButton("武器"+wq+"号");
                    b.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {//点击武器按钮执行单击事件代码
                            b.setEnabled(false);//禁用按钮，当我们选择了一把武器就定格，不能再次选择相同的武器。
                            list.add(wq);//将当前点击的按钮的长度保存在集合中
                            if(list.size()==3){ //触发召唤 
                                //执行召唤代码
                                zhaohuanStart();//调用召唤的交互过程
                            }
//                            JOptionPane.showMessageDialog(null,
//                                    "我知道你点了"+wq+"号武器,总共点击了"+list.size()+"次。");//再输出次数
                        }
                    });
                    p.add(b);
                }
                panel.add(p);//添加到中间层面板中
                panel.revalidate();//刷新
            }
        });
        btn.setBounds(0, 0, 200, 30);//设置按钮的尺寸和位置
        getContentPane().add(btn);//把按钮加入到顶层容器中
        getContentPane().add(panel);//面板容器准备就绪后，加入到顶层容器中
    }
    public void zhaohuanStart(){ //召唤开始功能
        //能够进入到这个方法的，说明客户已经选中了三把武器。
        //开始召唤
//        Integer get1 = list.get(0);
//        Integer get2 = list.get(1);
//        Integer get3 = list.get(2);
        Integer wq1 = list.remove(0);//把第一把武器拿出来,此时集合只剩下2把武器
        Integer wq2 = list.remove(0);//原来的第二把武器，现在是第一把了，所以这里依然是remove(0)
        Integer wq3 = list.remove(0);//只剩下最后一把武器，只能在下标为0的元素中
        boolean result = manager.zhaohuan(wq1, wq2, wq3); //放入三把武器进去，进行召唤运算
        if(result){//召唤成功
            count++;//把召唤金闪闪成功的次数 +1;
//            JOptionPane.showMessageDialog(null, "成功召唤金闪闪的次数是 "+count+"次");
            //提升了panel的作用域后，我们可以在这个方法中调用它。
            panel.setBackground(Color.green);//设置背景色为绿色
            panel.removeAll();//删除面板上的所有的组件
            panel.add(new JLabel("成功召唤出一个山寨金闪闪，当前召唤次数是"+count+"次。"));//添加一个标签组件
            panel.repaint();//重画，刷新
            panel.revalidate();//重新检查组件
        }else{
            panel.setBackground(Color.red);//设置背景色为绿色
            panel.removeAll();//删除面板上的所有的组件
            panel.add(new JLabel("召唤失败，一个破旧的金闪闪消散于空中。"));//添加一个标签组件
            panel.repaint();//重画，刷新
            panel.revalidate();//重新检查组件
        }
    }
    public static void main(String[] args) {//主方法
        WuqiJFrame wq = new WuqiJFrame();//实例化窗体类对象
        wq.setVisible(true);//显示窗体
    }//主方法结束大括号
}//WuqiJFrame类结束大括号
