/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi4;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class AppServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Mở cổng và bắt đầu nghe
            ServerSocket socketServer = new ServerSocket(8888);
            System.out.println("I'm listening on 8888 port...");
            //lắng nghe
            while(true)
            {
                //khi có yêu cầu tới => kết nối
                //mở một Socket để làm việc với client đó
                Socket socketClient = socketServer.accept();
                //Gửi câu trả lời
                OutputStream osToClient = socketClient.getOutputStream();
                OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
                BufferedWriter bufW = new BufferedWriter(write2Client);
                //gửi
                bufW.write("Xin chao");
                bufW.flush();
                //đóng socket
                socketClient.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}




