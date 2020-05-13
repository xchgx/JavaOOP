/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji01;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Manager {
    private String name;//姓名
    private String sex;//性别
    private String eid;//员工号
    private String key;//密钥
//    Ctrl + \
    public Manager(String name, String sex, String eid, String key) {
        this.name = name;
        this.sex = sex;
        this.eid = eid;
        this.key = key;
    }
    public void work(){}//工作
    public void clock(){}//打卡
    public void rest(){}//休息
    public void check(){}//检查监督
}
