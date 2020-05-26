/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.beike01;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println("字符串的长度："+s1.length());
        String s2 = new String("阿博茨的");
        System.out.println("中文字符串的长度：" + s2.length());
        System.out.println("s1字符串的下标为1的字符是："+s1.charAt(1));
        System.out.println("s2字符串的下标为1的字符是："+s2.charAt(1));
        String s3 = "abc";
        System.out.println("abc = abc 吗："+s1.compareTo(s3));
        s3 = "abcd";
        System.out.println("abc = abcd 吗："+s1.compareTo(s3));
        s3 = "ab";
        System.out.println("abc = ab 吗："+s1.compareTo(s3));
        s3 = "aacdefggggggggggggg";
        System.out.println("abc = aacdefggggggggggggg 吗："+s1.compareTo(s3));
        s3 = "ABC";
        System.out.println("abc = ABC 吗："+s1.compareTo(s3));
        System.out.println("abc = ABC 吗："+s1.compareToIgnoreCase(s3));
        String concat = s1.concat(s3);
        System.out.println("s1.concat(s3): " + concat);
        System.out.println("s1+s3: " + s1+s3);
        
        String s4 = "abcabc";
        System.out.println("abcabc是abca开头的嘛 = " + s4.startsWith("abca"));
        System.out.println("abcabc是bc开头的嘛 = " + s4.startsWith("bc"));
        
        String s5 = "tiku.txt";
        System.out.println("tiku.txt是.txt结尾的吗 = " + s5.endsWith(".txt"));
        System.out.println("tiku.txt是ku结尾的吗 = " + s5.endsWith("ku"));
        
        String s6 = new String("tiku.txt");
        System.out.println("s5和s6是指向同一个字符串吗:" + (s5==s6));
        System.out.println("s5和s6的值相等吗:" + (s5.equals(s6)));
        
        String s7 = "bc";
        System.out.println("s1.indexOf(s7)查找abc中bc的位置："+s1.indexOf(s7));
        
        System.out.println("abc中的bc替换为xx: "+ s1.replace("bc", "xx"));
        System.out.println("abcabc中的bc替换为yy: "+ s4.replaceAll("bc", "yy"));
        
        System.out.println("abc.substring(1)="+s1.substring(1));
        System.out.println("abc.substring(1,2)="+s1.substring(1,2));
        
        
    }
}
