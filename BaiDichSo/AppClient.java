/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class AppClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Tạo một kết nối Socket đến Server
            Socket sock = new Socket("localhost",8888);
            System.out.println("Connected!");
            //Lấy luồng nhập
            InputStream inS = sock.getInputStream();
            InputStreamReader inReader = new InputStreamReader(inS);
            BufferedReader buff = new BufferedReader(inReader);
            //Đọc trả lời và in ra
            System.out.println(buff.readLine());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
