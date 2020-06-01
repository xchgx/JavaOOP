package com.xchgx.javaoop.course16.beike01;

import java.util.StringTokenizer;

/**
 * StringBuffer类
 * @author 陈老师 现代管理学院
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("abc");
//        StringBuffer sb3 = "直接赋值是不允许的";
        sb2.append("111");
        System.out.println("sb2.toString() = " + sb2.toString());
        sb2.deleteCharAt(1);
        System.out.println("sb2 = " + sb2);
        sb2.delete(0, 2);
        System.out.println("sb2 = " + sb2);
        sb2.insert(1, "abc");
        System.out.println("sb2 = " + sb2);
        sb2.reverse();
        System.out.println("sb2 = " + sb2);
        sb2.setCharAt(0, 'b');
        System.out.println("sb2 = " + sb2);
        sb2.replace(2, 3, "中间");
        System.out.println("sb2 = " + sb2);
        
        String  str= "搜索结果\n" +
"包含网站链接的网页搜索结果\n" +
"\n" +
"The world's leading software development platform · GitHubgithub.com\n" +
"翻译此页\n" +
"GitHub brings together the world's largest community of developers to discover, share, and build better software. From open source projects to private team ...";
        StringTokenizer st = new StringTokenizer(str);
        int countTokens = st.countTokens();
        System.out.println("单词数量："+countTokens);
        while(st.hasMoreTokens()){
            String nextToken = st.nextToken();
            System.out.println("nextToken = " + nextToken);
        }
    } 
}
