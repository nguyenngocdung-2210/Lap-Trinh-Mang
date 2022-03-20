/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class Vd_TCPSocket2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // TODO code application logic here
            Socket socket = new Socket("time.nist.gov", 13);
            System.out.println("Connected!");
            
            InputStream in = socket.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader buff = new BufferedReader(inReader);
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            System.out.println(buff.readLine());
            
        } catch (IOException ex) {
            System.out.println("Not Connected!");
        }
    }
    
}
