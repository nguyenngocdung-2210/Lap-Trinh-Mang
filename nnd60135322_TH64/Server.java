/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnd60135322_TH64;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket socketServer = new ServerSocket(9999);
        System.out.println("I'm listening on 9999 port...");
        //
        int id=0;
        while(true){
            Socket soc = socketServer.accept();
            id ++;
            LuongDocFile luongTask = new LuongDocFile(soc,id);
            luongTask.start();
        }
    }
    
}
