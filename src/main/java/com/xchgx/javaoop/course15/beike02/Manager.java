/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course15.beike02;

import java.util.ArrayList;

/**
 * 留言数据类的操作功能类
 * @author 陈老师 现代管理学院
 */
public class Manager {//管理类 
    private ArrayList<Liuyan> liuyans = new ArrayList<>();//用来存放留言数据类集合
    private String txt;//留言原始数据。
 
    /**
     * 杨昆 15:05:19
      张宏略 15:06:55
      鬼泣尼禄刀刀三红的大佬有没有

     * @param row
     * @return 
     */
    public boolean isLiuyanRow(String row){
        return row.matches(".* \\d+:\\d\\d:\\d\\d");//点（.）和星号（*）可以通配任何字符任何个数
    }
    //从留言行中获得姓名
    public String fetchName(String row){
        String[] firstLiuyans = row.split(" ");
        return firstLiuyans[0];
    }
    
    /**
     * 开始执行解析工作
     */
    public void start(){
        String[] rows = txt.split("\n");
        for(String row : rows){ //遍历留言记录行数组
            boolean liuyanRow = isLiuyanRow(row);
            if (liuyanRow) {
                String name = fetchName(row);
                boolean existsInArrayList = existsInArrayList(name);
                if (existsInArrayList) {//如果已经存在该留言者，就让留言次数+1
                    Liuyan liuyan = findLiuyanByName(name);
                    int count = liuyan.getCount();
                    count++;
                    liuyan.setCount(count);
                }else{//否则就添加一个新的留言者，并设置留言次数为1 
                    liuyans.add(new Liuyan(name, 1));
                } 
            }
        }
    }
    /**
     * 集合中是否已经存在该留言者
     * @param name 
     * @return 
     */
    public boolean existsInArrayList(String name){
        for(Liuyan ly : liuyans){
            if(ly.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    /**
     * 通过姓名查询留言者对象
     * @param name
     * @return 
     */
    public Liuyan findLiuyanByName(String name){
        for(Liuyan ly : liuyans){
            if(ly.getName().equals(name)){
                return ly;
            }
        }
        return null;
    }
    /**
     * 格式化输出
     * @return 
     */
    public String show(){
        String result = "";//用来保存格式化后的输出。
        for(Liuyan ly : liuyans){
            result += "留言者："+ly.getName()+",留言次数："+ly.getCount()+"\n";
        }
        return result;
    }
    public Manager() {
    }

    public Manager(String txt) {
        this.txt = txt;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
    
    
}
