/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class RunMain {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        System.out.println("5.1 + 6.941 = " + mt.TinhTong(5.1f, 6.9f));
        System.out.println("5.1 + 6.941 + 3.14 = " + mt.TinhTong(5.1f, 6.9f, 3.14f));
        float a[] = {4.5f, 12.9f, 5.7f};
        System.out.println("Tong cac phan tu mang a la: " + mt.TinhTong(a));
    }
}
