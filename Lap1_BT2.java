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
public class Lap1_BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Canh 1: ");
        Double canh1 = sc.nextDouble();
        System.out.println("Canh 2: ");
        Double canh2 = sc.nextDouble();
        Double chuvi = (canh1+canh2)*2;
        Double dientich = canh1*canh2;
        Double canhnhonhat = Math.min(canh1,canh2);
        System.out.println("==============================================");
        System.out.printf("chuvi= %.1f \n dientich = %.1f \n Canh nho nhat = %.1f ",chuvi,dientich,canhnhonhat);
    }
    
}
