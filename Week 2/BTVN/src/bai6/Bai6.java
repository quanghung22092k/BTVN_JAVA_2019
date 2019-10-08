/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public interface Bai6 {
    public static void main(String[] args){
        int n1,m1;
        double n2,m2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n1: ");
        n1 = sc.nextInt();
        System.out.print("Nhap so nguyen m1: ");
        m1 = sc.nextInt();
        System.out.print("Nhap 1 so thuc n2: ");
        n2 = sc.nextDouble();
        System.out.print("Nhap 1 so thuc m2: ");
        m2 = sc.nextDouble();
        System.out.println("n1 + m1 = " + (n1+m1) + ", n2 + m2 = " + (n2+m2) + ", n1 + n2 = " + (n1+n2));
    }
}
