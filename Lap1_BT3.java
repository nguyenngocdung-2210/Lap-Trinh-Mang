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
public class Lap1_BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Canh : ");
        Double canh = sc.nextDouble();
        Double thetich = Math.pow(canh, 3);
        System.out.println("==============================================");
        System.out.printf("The tich= %.1f",thetich);
    }
    
}
