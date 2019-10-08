/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai9 {
    public static void main(String[] args) {
        System.out.println("--- CHUONG TRINH GIAI PT BAC NHAT Ax + B = 0 ---");
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so A: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so B: ");
        b = sc.nextDouble();
        if(a==0)
            System.out.println("PTVN");
        else
            System.out.println("x = " + -b/a);
    }
}
