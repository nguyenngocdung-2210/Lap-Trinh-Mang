/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lap3_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N: ");
        Double N = sc.nextDouble();
        boolean SNT = true;
        for (int i = 2; i < N-1; i++) {
            if(N%i==0){
                SNT=false;
                break;
            }
            //i++;
        }
        if(SNT){
            System.out.printf("%.0f la so nguyen to",N);
        }else{
            System.out.printf("%.0f khong la so nguyen to",N);
        }
        
    }
    
}
