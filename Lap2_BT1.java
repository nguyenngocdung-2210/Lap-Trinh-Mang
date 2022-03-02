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
public class Lap2_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("so a: ");
        Double soA = sc.nextDouble();
        System.out.println("so b: ");
        Double soB = sc.nextDouble();
        if(soA==0){
            if (soB==0) {
                System.out.println("Vo so nghiem");
            }else {
                System.out.println("Vo nghiem");
            }
        }else{
            Double x = -soB/soA;
            System.out.printf("Nghiem x =%.3f ",x);
        }
        
    }
    
}
