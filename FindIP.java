/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class FindIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InetAddress diachi;
        try {
            diachi = InetAddress.getByName("ntu.edu.vn");
            System.out.println(diachi);
                    } catch (UnknownHostException ex) {
            System.out.println("Host khong ton tai");
        }
    }
    
}
