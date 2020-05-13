package com.xchgx.javaoop.course03.ketangbiji01;
public class Manager2Test {
    //主方法
    public static void main(String[] args) {
        //验证继承后能否得到父类的属性和方法
        String name = "张三";
        String sex = "男";
        String eid = "SCB001";
        String key = "!@#$%^&*()";
        Manager2 manager2 = new Manager2(name, sex, eid, key);
        System.out.println("manager2.getName() = " + manager2.getName());
        System.out.println("manager2.getSex() = " + manager2.getSex());
        System.out.println("manager2.getEid() = " + manager2.getEid());
//        System.out.println("manager2.getKey() = " + manager2.getKey());
    }
}
