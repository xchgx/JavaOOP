/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course03.ketangbiji02;

/**
 *
 * @author 陈老师 <现代管理学院>
 */
public class Student extends Person{//学生类 从 Person 中继承所有属性和方法
 private String sno;//学号
 private String department;//院系

 public String getSno() { return sno; }
 public void setSno(String sno) { this.sno = sno; }
 public String getDepartment() { return department; }
 public void setDepartment(String department) { this.department = department; }
 //同样还继承了 Person 人员类的 show()方法
 //重写show()方法,按Ctrl+\

    @Override
    public void show() {
         //super.show(); //不要父类的代码，自己重新写
         System.out.println("来自于学生Student");
         System.out.println("name = " + getName());
         System.out.println("sex = " + getSex());
         System.out.println("age = " + getAge());
         System.out.println("sno = " + sno); //显示学生的学号
         System.out.println("department = " + department);//显示学生的部门
    }
 
}
