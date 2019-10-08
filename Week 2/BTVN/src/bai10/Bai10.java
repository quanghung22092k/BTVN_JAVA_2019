/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai10 {
    public static void main(String[] args) {
        System.out.println("--- CHUONG TRINH GIAI PT BAC HAI Ax2 + Bx + C = 0 ---");
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap he so A: ");
        a = sc.nextDouble();
        System.out.print("Nhap he so B: ");
        b = sc.nextDouble();
        System.out.print("Nhap he so C: ");
        c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta<0){
            System.out.println("PTVN");
        }
        else if(delta==0){
            System.out.println("PT co nghiem kep x = " + -b/(2*a));
        }
        else{
            System.out.println("PT co 2 nghiem phan biet");
            System.out.println("x1 = " + (-b+sqrt(delta))/(2*a));
            System.out.println("x2 = " + (-b-sqrt(delta))/(2*a));
        }
    }
}
