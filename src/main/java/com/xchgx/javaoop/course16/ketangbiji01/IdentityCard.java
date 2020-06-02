/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course16.ketangbiji01;

/**
 * 身份证号码处理功能类
 * @author 陈老师 现代管理学院
 */
public class IdentityCard {
    //42011120020126115X
    private String icNumber;//身份证号码
    
    //从身份证号码当中分析得到省份
    //IPO: Input输入 Process处理 Out输出
    public String analysisSheng(){
        //第一步要截取身份证号码的前两位。
        //42011120020126115X
        String sheng=icNumber.substring(0, 2);//截取到 42
        //将这两位数字代码转换成省份名称
        //如果sheng（省份代码）等于42，那么返回 湖北省
        //如果sheng（省份代码）等于43，那么返回 湖南省
        //如果sheng（省份代码）等于44，那么返回 广东省
        switch(sheng){
            case "42": return "湖北省";
            case "43": return "湖南省";
            case "44": return "广东省";
            default:   return "未知省份";
        }
    }
    //从身份证号码当中分析得到 年月日
    //IPO 输入、处理、输出
    public String analysisBirthday(){
        //从身份证号码当中截取出生日期的字符串
        //420111 20020126 115X
        String birthday = icNumber.substring(6, 14); //20020126
        //StringBuffer的效率和性能表现，比String类要高。
        StringBuffer sb = new StringBuffer();//StrintBuffer类
        String year = birthday.substring(0, 4);//2002
        String month = birthday.substring(4, 6);//01
        String date = birthday.substring(6);//01
        sb.append(year).append("年")
                .append(month).append("月")
                .append(date).append("日");
        //"2002"+"年"+"01"+"月";
        return sb.toString();//不能直接返回sb，要转换成字符串后返回。
    }
    //从身份证号码当中分析得到性别
    //IPO，输入 处理 输出
    public String analysisSex(){
        //从身份证号码中截取性别数字代号
        //倒数第二位:身份证字符串的长度()-2,beginIndex
        //倒数第一位:身份证字符串的长度()-1,endIndex
        //42011120020126115X = 5
        StringBuffer sb = new StringBuffer();
        int beginIndex = icNumber.length()-2;//倒数第2位
        int endIndex = icNumber.length()-1;//倒数第1位
        String sexCode = icNumber.substring( beginIndex, endIndex );//性别代号 5
        //将字符串的代号转换成数字代号（整型）
        int sexInt = Integer.parseInt(sexCode); // "5" ==>  5, 将字符串转换为整型数字
        //男单女双，奇数为 男性  ，偶数为 女性
        if(sexInt % 2 == 0){//对性别数字Mod 2运算，如果余数为0，则是女性
            sb.append("女性");
        }else{
            sb.append("男性");
        }
        return sb.toString();
    }
    
    //格式化输出
    //IPO  输入 处理 输出
    public String show(){
        StringBuffer sb = new StringBuffer();
        sb.append("------------------------------\n");
        sb.append("省份:").append(analysisSheng()).append("\n");
        sb.append("性别:").append(analysisSex()).append("\n");
        sb.append("生日:").append(analysisBirthday()).append("\n");
        sb.append("------------------------------\n");
        return sb.toString();
    }
    
    //判断输入的身份证号码是否符合规则
    public boolean isIdentityCard(){//是身份证号码吗
//        420111  20020126 115X
        return icNumber.matches("\\d{6}[1-2][0-9]{3}[0-1]\\d[0-3]\\d\\d{2}\\d[0-9Xx]");//利用正则表达式判断输入的是不是身份证号码
    }
    //下面的代码有开发工具生成的
    //生成构造器、getter和setter

    public IdentityCard(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }
    
    
}
