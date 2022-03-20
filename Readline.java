/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class Readline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader isRdr;
        isRdr = new InputStreamReader(System.in);
        BufferedReader buffReader = new BufferedReader(isRdr);
        System.out.println("Nhap chuoi ky tu: ");
        String strLine = buffReader.readLine();
        System.out.println("Chuoi ky tu ban vua nhap la: "+strLine);
    }
    
}
