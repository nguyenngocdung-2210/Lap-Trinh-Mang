/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class VD_TCPSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Socket socket = new Socket("ntu.edu.vn", 80);
            System.out.println("Connected!");
        } catch (IOException ex) {
            System.out.println("Not Connected!");
        }
        
    }
    
}
