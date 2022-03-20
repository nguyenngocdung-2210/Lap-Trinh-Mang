/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class Read1CharByReadr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // tao mot doi tuong cua lop InputStreamReader
        InputStreamReader isRdr;
        isRdr = new InputStreamReader(System.in);
        System.out.println("Nhap ki tu: ");
        int kt = isRdr.read();
        System.out.print("Ky tu ban vua nhap la: "+(char)kt);
        
        
    }
    
}






