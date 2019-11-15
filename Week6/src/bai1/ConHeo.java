/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ConHeo {
    private String ten;
    private float canNang;
    private int tuoi;
    
    public ConHeo(String ten) {
        this.ten = ten;
    }
    
    public ConHeo(float canNang) {
        this.canNang = canNang;
    }
    
    public ConHeo(String ten, float canNang) {
        this.ten = ten;
        this.canNang = canNang;
    }
    
    public ConHeo(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
    
    public ConHeo(String ten, float canNang, int tuoi) {
        this.ten = ten;
        this.canNang = canNang;
        this.tuoi = tuoi;
    }
    
    public static void HienThiThongTin(){
        ConHeo heo1 = new ConHeo("Tai");
        ConHeo heo2 = new ConHeo(231);
        ConHeo heo3 = new ConHeo("Hoang",290);
        ConHeo heo4 = new ConHeo("Tung", 19);
        ConHeo heo5 = new ConHeo("Anh", 210, 19);
        System.out.println(heo1.ten + " " + heo1.canNang + " " + heo1.tuoi);
        System.out.println(heo2.ten + " " + heo2.canNang + " " + heo2.tuoi);
        System.out.println(heo3.ten + " " + heo3.canNang + " " + heo3.tuoi);
        System.out.println(heo4.ten + " " + heo4.canNang + " " + heo4.tuoi);
        System.out.println(heo5.ten + " " + heo5.canNang + " " + heo5.tuoi);
    }
}
