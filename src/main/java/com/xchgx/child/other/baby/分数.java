/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.child.other.baby;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class 分数 implements Comparable<分数>{
    private int 分子;
    private int 分母;

    public double getResult(){
        return 分子*1.0/分母;
    }

    @Override
    public String toString() {
        return "\u5206\u6570{" + "" + 分子 + "/" + 分母 + '}';
    }
    
    public 分数() {
    }

    public 分数(int 分子, int 分母) {
        this.分子 = 分子;
        this.分母 = 分母;
    }

    public int get分子() {
        return 分子;
    }

    public void set分子(int 分子) {
        this.分子 = 分子;
    }

    public int get分母() {
        return 分母;
    }

    public void set分母(int 分母) {
        this.分母 = 分母;
    }

    @Override
    public int compareTo(分数 o) {
        if(this.getResult()> o.getResult()){
            return 1;
        }else if(this.getResult()<o.getResult()){
            return -1;
        }else{
            return 0;
        }
    }
    
}
