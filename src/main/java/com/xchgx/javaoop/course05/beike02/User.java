/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course05.beike02;

/**
 *
 * @author 陈老师 现代管理学院
 */
public class User {
    private String name;
    private String username;
    private String password;
    private String sex;
    private String phone;
    private String email;
    private String birthday;

    public User() {
    }

    public User(String name, String username, String password, String sex, String phone, String email, String birthday) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
    }
    
    public User(String username, String password ) {
        this.username = username;
        this.password = password;
    }

    public User(String name, String username, String password  ) {
        this.name = name;
        this.username = username;
        this.password = password; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", username=" + username + ", password=" + password + ", sex=" + sex + ", phone=" + phone + ", email=" + email + ", birthday=" + birthday + '}';
    }
    
}
