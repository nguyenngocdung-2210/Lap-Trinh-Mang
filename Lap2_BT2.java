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
public class Lap2_BT2 {

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
        System.out.println("so C: ");
        Double soC = sc.nextDouble();
        if (soA==0) {
            if(soB==0){
                if (soC==0) {
                    System.out.println("Vo so nghiem");
                }else {
                    System.out.println("Vo nghiem");
                }
            }else{
                Double x = -soC/soB;
                System.out.printf("Nghiem x =%.3f ",x);
            }
        }else
        {
            Double delta = Math.pow(soB,2)-4*soA*soC;
            Double CanDelta = Math.sqrt(delta);
            if (delta<0) {
                System.out.println("Vo nghiem");
            }
            if (delta==0) {
                Double x = -soB/(2*soA);
                System.out.printf("Nghiem kep x: %.3f",x);
            }
            if (delta>0) {
                Double x1 = (-soB+CanDelta)/(2*soA);
                Double x2 = (-soB-CanDelta)/(2*soA);
                System.out.printf("Nghiem X1 = %.3f \nNghiem X2 = %.3f",x1,x2);
            }
            
        }
}
        
    
}
