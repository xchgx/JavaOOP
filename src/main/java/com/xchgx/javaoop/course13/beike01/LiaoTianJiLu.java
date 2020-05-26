/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.xchgx.javaoop.course13.beike01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class LiaoTianJiLu {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Scanner scanner = new  Scanner(new File("D:\\ltjl.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\ltjl.txt")));
        String nextLine = br.readLine();
        ArrayList<Student> students = new ArrayList<>();
        while(nextLine != null){
            int space = nextLine.indexOf(" ");
            if(space == -1){
                nextLine = br.readLine();
                continue;
            }
            String name = nextLine.substring(0,space);
            String time = nextLine.substring(space);
            String trim = time.replaceAll("\\d", "").replaceAll(":", "").replaceAll(" ", "").replaceAll("/", "").trim();
            if(trim.isEmpty()){
//                String readLine = br.readLine();
//                if(readLine.contains("9")){
                    boolean finded = false;
                    for(Student stu : students){
                        if(stu.getName().equals(name)){
                            stu.jj();
                            finded = true;
                        }
                    }
                    if(!finded){
                        Student student = new Student(name); 
                        students.add(student);
                    }
//                }
            } 
            nextLine = br.readLine();  
        } 
        int i=1;
        for(Student stu : students){
            System.out.println(i+". " + stu.getName()+", 发言次数："+stu.getCount());
            i++;
        }
        
    }
}
