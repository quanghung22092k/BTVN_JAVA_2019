/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    
    static boolean soHoanHao(double x){
        int sum = 0;
        for(int i = 1; i <= x/2; i++){
            if(x%i == 0) 
                sum += i;
        }
        if(sum == x){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ta co mot mang so thuc");
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        double a[] = new double [n];
        
        System.out.print("Nhap mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i] < a[j]){
                    double t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Mang sau khi sap xep: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        
        System.out.print("Nhap vao mot so x = ");
        double x = sc.nextDouble();
        if(soHoanHao(x)){
            System.out.println("x la mot so hoan hao");
            
        }
        else{
            System.out.println("x khong phai la mot so hoan hao");
        }
        System.out.print("Mang moi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(x);
    }
}
