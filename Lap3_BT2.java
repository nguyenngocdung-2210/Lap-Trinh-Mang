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
public class Lap3_BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x = 10;
        for (int i = 2; i < x; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.printf("%d*%d = %d",i,j,i*j);
                System.out.println();
            }
            System.out.println("====================");
        }
    }
    
}
