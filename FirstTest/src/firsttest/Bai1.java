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
public class Bai1 {
    
    static int convertToInt(char ch) {
        return (ch - '0');
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String c = sc.nextLine();
        int dem = 0;
        int sum = 0;
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) >= '0' && c.charAt(i) <= '9' && convertToInt(c.charAt(i))%2 == 0){
                dem++;
                sum += convertToInt(c.charAt(i));
            }
        }
        System.out.println("Chuoi vua nhap co " + dem + " so chan");
        System.out.println("Tong cac so chan trong chuoi: " + sum);
    }
}
