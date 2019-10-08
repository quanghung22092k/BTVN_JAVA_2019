/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai7 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap mot so b: ");
        b = sc.nextDouble();
        if(a>b)
            System.out.println("max = a = " + a);
        else if(a<b)
            System.out.println("max = b = " + b);
        else
            System.out.println("a = b = " + a);
    }
}