/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author USER
 */
public class Read1CharByInputStream {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //Tao mot doi tuong cua lop InputStream
        InputStream is;
        //gan no voi luong nhap chuan (ban phim)
        is = System.in;
        // doc ky tu
        int kt = is.read();
        System.out.print("Ky tu ban vua nhap la: "+(char)kt);
    }
    
}
