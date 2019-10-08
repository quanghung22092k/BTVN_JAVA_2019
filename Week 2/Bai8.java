/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai8 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mot so a: ");
        a = sc.nextDouble();
        System.out.print("Nhap mot so b: ");
        b = sc.nextDouble();
        System.out.print("Nhap mot so b: ");
        c = sc.nextDouble();
        double max = a;
        if(max<b)
            max = b;
        if(max<c)
            max = c;
        System.out.println("max = " + max);
    }
}
