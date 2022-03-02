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
public class Lap1_BT4 {

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
        System.out.println("so c: ");
        Double soC = sc.nextDouble();
        Double delta = Math.pow(soB,2)-4*soA*soC;
        Double CanDelta = Math.sqrt(delta);
        System.out.println("==============================================");
        System.out.printf("Can delta =%.3f ",CanDelta);
    }
    
}
