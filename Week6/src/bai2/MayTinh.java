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
public class MayTinh {
    public float TinhTong(float a,float b){
        float s = a + b;
        return s;
    }
    
    public float TinhTong(float a,float b,float c){
        float s = a + b + c;
        return s;
    }
    
    public float TinhTong(float a[]){
        float s = 0;
        for(int i = 0; i < a.length; i++){
            s += a[i];
        }
        return s;
    }
}
