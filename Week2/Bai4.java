/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
        int n;
        double m;
        String c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 so nguyen n: ");
        n = sc.nextInt();
        System.out.print("Nhap 1 so thuc m: ");
        m = sc.nextDouble();
        System.out.print("Nhap 1 xau ky tu c: ");
        sc.nextLine();
        c = sc.nextLine();
        System.out.println("n = " + n + ", m = " + m + ", c = " + c);
    }
}
