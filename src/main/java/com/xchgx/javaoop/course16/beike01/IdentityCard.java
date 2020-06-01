/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course16.beike01;

/**
 * 身份证号码
 * @author 陈老师 现代管理学院
 */
public class IdentityCard {
    private String identityNumber;//身份证号码 
     
    /**
     * 检查是否符合身份证的规范
     * @return 
     */
    public boolean isIdCard(){
        return identityNumber.matches("\\d{6}[1-2]\\d{3}[0-1]\\d[0-3]\\d\\d{3}[0-9Xx]");
    }
    /**
     * 
     * 从身份证号码中获得省份
     * @return 
     */
    public String analysisSheng(){
        //42 1102200011111234
        String sheng = identityNumber.substring(0, 2);
        Data data = new Data();
        String find = data.find(sheng);
        return  find;
//        switch(sheng){
//            case "41":return "河南";
//            case "42":return "湖北";
//            case "43":return "湖南";
//            case "44":return "广东";
//            default: return"未知省份";
//        }
    }
    public String analysisBirthday(){
        //421102 20001112 1234
        StringBuffer sb = new StringBuffer();
        String birthday = identityNumber.substring(6, 14);//获得出生日期数字20001112
        String year = birthday.substring(0,4); //读取年份[0,3] 2000
        sb.append(year).append("年");
        String month = birthday.substring(4,6); //读取月份 11
        sb.append(month).append("月");
        String date = birthday.substring(6,8);//读取日期 12
        sb.append(date).append("日");
        return sb.toString(); 
    }
    /**
     * 从身份证号码中获得性别
     * @return 
     */
    public String analysisSex(){
        //4211022000111212 3 4
        StringBuffer sb = new StringBuffer();
        String sex = identityNumber.substring(16, 17);//获得出生日期数字20001112
        int sexId = Integer.parseInt(sex);
        if(sexId % 2==0){
            sb.append("女性");
        }else{
            sb.append("男性");
        }
        return sb.toString();        
    }
    /**
     * 格式化输出
     * @return 
     */
    public String show(){
        StringBuilder sb = new StringBuilder("");
        sb.append("------------------------\n");
        sb.append("省份：").append(analysisSheng()).append("\n");
        sb.append("性别：").append(analysisSex()).append("\n");
        sb.append("出生日期：").append(analysisBirthday()).append("\n");
        return sb.toString();
    }
    //以下代码由开发工具提供
    public IdentityCard(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    } 
}
