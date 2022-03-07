/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab3_BT3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, Min;
        double sum = 0, dem = 0;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhap so phan tu: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    
    int array[] = new int[n];
         
    for (int i = 0; i < n; i++) {
        System.out.println("Nhap phan tu thu " + i + ": ");
        array[i] = scanner.nextInt();
    }
         
    
    System.out.println("\nMang ban dau: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
    Arrays.sort(array);
    System.out.println("\nMang sau khi sap xep: "+Arrays.toString(array));
    int min=array[1];
    for (int i = 0; i < n; i++) {
        Min = Math.min(min, array[i]);
        System.out.printf("Phan tu nho nhat: %d",Min);
        break;
    }
    for (int i = 0; i < n; i++) {
        if (array[i]%3==0) {
            sum = array[i]+sum;
            dem = dem + 1;
        }
    }
    double S = sum / dem;
    System.out.printf("\nTrung binh cong: %.3f", S);
    }
    
}
