/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course15.ketangbiji01;

import java.util.ArrayList;

/**
 * 数据处理类，管理类
 * //专门负责处理 留言类Liuyan.java
 * @author Administrator
 */
public class Manager {
    private String logs;//原始数据
    private String[] liuyans;//没有初始化，小心报错误异常。
    //这是内部使用，不需要从外部传入，所以，顺便也实例化了
    private ArrayList<Liuyan> authors = new ArrayList<>();
    

    /**
     * 对原始数据进行分割处理，形成留言行数组
     * <br>
     * 这个方法一定要最先执行，否则liuyans数组属性将是null的，会出错的。
     * @return 
     */
    public String[] split(){
        liuyans = logs.split("\n");
        return liuyans;
    }
    /**
     * 判断数据行（留言行）是否满足留言者发言的格式（带有时间戳）
     * @param row 留言行
     * @return 
     */
    public boolean isLiuyanStart(String row){
        boolean matches = row.matches(".* \\d{1,2}:\\d{2}:\\d[0-9]"); //通过正则寻找定位留言者发言的那一行
        return matches;
    }
    /**
     * 你把行给我，我把名字给你。
     * 从数据行（留言行）中获得（截取）姓名
     * @param row
     * @return 
     */
    public String fetchName(String row){
//        李博文 10:13:47
//        李博 10:13:47
        String[] split = row.split(" "); //以空格作为分隔符，转换成数组
        return split[0];//数组的下标为0的元素就是姓名
    }
    /**
     * 开始处理数据
     */
    public void start(){
        split();//把原始数据分割成留言行数组，保存在成员属性 liuyans中
        for(String row : liuyans){
            boolean liuyanStart = isLiuyanStart(row);//这个行是留言开始行
            if(liuyanStart){ //如果是包含留言者姓名的行
                String name = fetchName(row);//从行中获得姓名
                //将姓名和次数放入留言者数组集合中
                //寻找该姓名是否已经存在于集合中
                Liuyan auth=null;//准备一个空的引用
                for(Liuyan ly : authors){//
                    if(ly.getName().equals(name)){
                        //如果留言行中获得的名字与数组中的姓名相同
                        //表示该留言者已经存在
                        auth = ly;//那么就把该留言者对象保存在auth对象中
                    }
                }
                if(auth == null){//整个数组集合都遍历了一遍，auth还是null
                    //说明数组集合中没有name这个留言者，没有找到相同名字的
                    authors.add(new Liuyan(name, 1));
                }else{ //找到了，这时候的auth就指向了相同name（名字）的留言者对象
                    int count = auth.getCount(); //获得留言次数
                    count++;//次数+1
                    auth.setCount(count);
                } 
            }
        }
    }
    /**
     * 把留言者和留言次数，格式化后输出。
     * @return 
     */
    public String show(){
        String result = "";
        for(Liuyan ly : authors){
            result += ly.getName()+",留言次数："+ly.getCount()+"\n";
        }
        return result;
    }
    //以下是IDE工具提供的代码
    //构造器、 getter和setter
    public Manager(String logs) {
        this.logs = logs;
    }

    public String getLogs() {
        return logs;
    }

    public void setLogs(String logs) {
        this.logs = logs;
    }
    
}
