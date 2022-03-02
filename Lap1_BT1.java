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
public class Lap1_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho và Ten: ");
        String hoTen = sc.nextLine();
        System.out.println("diem: ");
        Double diem = sc.nextDouble();
        System.out.println("==============================================");
        System.out.printf("%s - %.1f diem",hoTen,diem);
        
    }
    
}
