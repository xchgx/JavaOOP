/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course14.beike02;

import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Manager {

    private ArrayList<Liuyan> liuyans = new ArrayList<>();
    private String logs;

    /**
     * 判断是不是留言开始行
     *
     * @param row 一行留言
     * @return 是否为留言开始行
     */
    public boolean isLiuyanStart(String row) {
//          + "张佳豪 11:28:26\n"
        return row.matches(".*\\d+:\\d+:\\d+");
    }

    /**
     * 从行中获得留言者姓名
     *
     * @param row 一行留言数据
     * @return
     */
    public String fetchName(String row) {
        int start = row.indexOf(" ");//如：何砼洋 11:19:37 返回3 
        String name = row.substring(0, start); //从0开始，不包含空格（3），正好是姓名 何砼洋  
        return name;
    }

    /**
     * 检查集合中是否已经存在该留言者
     *
     * @param name 留言者
     * @return
     */
    public boolean exists(String name) {
        boolean finded = false;
        for (Liuyan ly : liuyans) {
            if (ly.getName().equals(name)) {
                finded = true;
            }
        }
        return finded;
    }

    public Liuyan fetchLiuyan(String name) {
        Liuyan finded = null;
        for (Liuyan ly : liuyans) {
            if (ly.getName().equals(name)) {
                finded = ly;
            }
        }
        return finded;
    }

    /**
     * 开始处理留言记录
     */
    public void start() {
        String[] rows = logs.split("\n");
        for (String row : rows) {
            if (isLiuyanStart(row)) {
                String name = fetchName(row);
                Liuyan ly = fetchLiuyan(name);
                if (ly == null) {
                    liuyans.add(new Liuyan(name, 1));
                } else {
                    ly.jiajia();
                }
            }
        }
    }
    /**
     * 获得格式化的输出
     * @return 
     */
    public String show() {
        String result = "";
        for (Liuyan ly : liuyans) {
            result += ly.getName() + ":" + ly.getCount() + "\n";
        }
        return result;

    }

    public Manager(String logs) {
        this.logs = logs;
    }

    public ArrayList<Liuyan> getLiuyans() {
        return liuyans;
    }

    public void setLiuyans(ArrayList<Liuyan> liuyans) {
        this.liuyans = liuyans;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }

}
