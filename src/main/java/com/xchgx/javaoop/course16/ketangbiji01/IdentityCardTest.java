/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course16.ketangbiji01;

import java.util.StringTokenizer;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class IdentityCardTest {
    public static void main(String[] args) {
        String icnumber = "44011120021126116X";
        IdentityCard ic = new IdentityCard(icnumber);
        String sheng = ic.analysisSheng();//获得省份
        System.out.println("省份 = " + sheng);
        
        String birthday = ic.analysisBirthday(); //获得出生年月日
        System.out.println("birthday = " + birthday);
        
        String str = "123456789";
        System.out.println("字符串的长度 = " + str.length());
        System.out.println("最后一位："+(str.length()-1));
        
        String sex = ic.analysisSex();
        System.out.println("sex = " + sex);
        
        String show = ic.show();
        System.out.println("show = " + show);
        
        
        IdentityCard ic2 = new IdentityCard("999999199919399999");
        boolean identityCard = ic2.isIdentityCard();
        if(identityCard){
            System.out.println("这是身份证号码");
            String show1 = ic2.show();
            System.out.println("show1 = " + show1);
        }else{
            System.out.println("这不是身份证号码");
        }
        
        
        String hello = "I'm 10 years.";//英文
        StringTokenizer st = new StringTokenizer(hello,"' .");
        int countTokens = st.countTokens();//单词个数
        System.out.println("countTokens = " + countTokens);
        while(st.hasMoreTokens()){ //循环还有单词吗？如果有就进入循环
            String nextToken = st.nextToken();//拿出一个单词
            System.out.println("nextToken = " + nextToken);
        }
    }
}
