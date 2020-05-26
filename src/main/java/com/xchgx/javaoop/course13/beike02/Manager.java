/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course13.beike02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class Manager {

    private ArrayList<Student> students = new ArrayList<>();//留言人集合
    private String logfile;//日志文件路径
    private BufferedReader br;//文件阅读对象

    public Manager(String logfile) throws FileNotFoundException {
        this.logfile = logfile;
        br = new BufferedReader(new InputStreamReader(new FileInputStream(logfile)));
    }

    public void startReadLogFile() throws IOException {
        String line = br.readLine();
        while (line != null) {
            int space = line.indexOf(" ");
            if (space == -1) {
                line = br.readLine();
                continue;
            }
            String name = line.substring(0, space);
            String time = line.substring(space);
            String trim = time.replaceAll("\\d", "").replaceAll(":", "").replaceAll(" ", "").replaceAll("/", "").trim();
            if (trim.isEmpty()) {
//                String readLine = br.readLine();
//                if (readLine.contains("9")) {
//                boolean finded = false;
                Student student = null;
                for (Student stu : students) {
                    if (stu.getName().equals(name)) {
                        student = stu;
//                        finded = true;
                    }
                }
//                }
                //寻找一条留言的结束
                String logContent = "";
                do {
                    line = br.readLine();
                    logContent+=line+"\n";
                } while (!line.isEmpty());

                if (student== null) {
                    student = new Student(name);
                    students.add(student);
                } 
                student.getLogStart().add(time);
                student.getLogContent().add(logContent);
                student.jj();
            }
            line = br.readLine();
        }
    }
    public String show(){
        String result = "";
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            result += "姓名："+student.getName()+",留言数："+student.getCount()+",留言日期："+student.getLogStart()+",留言内容："+student.getLogContent()+"\n";
        }
        return result;
    }
    /**
     * 别忘了关闭文件阅读对象
     */
    public void close() throws IOException {
        this.br.close();
    }

}
