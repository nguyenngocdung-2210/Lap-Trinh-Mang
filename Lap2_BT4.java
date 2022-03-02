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
public class Lap2_BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("So TT: ");
        int soTT = scanner.nextInt();
        switch(soTT){
            case 1:
                System.out.println("Giai Phuong Trinh Bac Nhat");
                Scanner sc1 = new Scanner(System.in);
                System.out.println("so a: ");
                Double soA = sc1.nextDouble();
                System.out.println("so b: ");
                Double soB = sc1.nextDouble();
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
                break;
            case 2:
                System.out.println("Giai Phuong Trinh Bac 2");
                Scanner sc2 = new Scanner(System.in);
                System.out.println("so a: ");
                soA = sc2.nextDouble();
                System.out.println("so b: ");
                soB = sc2.nextDouble();
                System.out.println("so C: ");
                Double soC = sc2.nextDouble();
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
                break;
            case 3:
                System.out.println("Tinh Tien Dien");
                Scanner sc3 = new Scanner(System.in);
                System.out.println("So dien: ");
                Double soDien = sc3.nextDouble();
                if(soDien<50){
                    Double tien = soDien*1000;
                    System.out.printf("So tien =%.0f ",tien);
                }else{
                    Double tien = 50*1000 + (soDien-50)*1200;
                    System.out.printf("So tien =%.0f ",tien);
                }
                break;
            case 4:
                System.out.println("Ket Thuc");
                break;
        }
    }
    
}
