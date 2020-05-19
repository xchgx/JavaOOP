/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xchgx.javaoop.course08.beike06;

/**
 *
 * @author Administrator
 */
public class NiuRenTest {
    public static void main(String[] args) {
        NiuRen niuren = new NiuRen();
        Driver driver = niuren;
        Racer racer = niuren;
        Teach teacher = niuren;
        driver.kaiche();
        racer.racing();
        teacher.teaching();
    }
}
