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
public class Lap2_BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("So dien: ");
        Double soDien = sc.nextDouble();
        if(soDien<50){
            Double tien = soDien*1000;
            System.out.printf("So tien =%.0f ",tien);
        }else{
            Double tien = 50*1000 + (soDien-50)*1200;
            System.out.printf("So tien =%.0f ",tien);
        }
        
    }
    
}
