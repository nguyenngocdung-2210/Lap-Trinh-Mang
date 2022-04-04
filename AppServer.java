/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author USER
 */
public class AppServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {			
            ServerSocket socketServer = new ServerSocket(9999);
            System.out.println("I'm listening on 9999 port....");
            while (true)
		{
                    Socket socketClient = socketServer.accept();
                    OutputStream osToClient = socketClient.getOutputStream();
                    OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
                    BufferedWriter bufferWrite = new BufferedWriter(write2Client);
                    InputStream in =  socketClient.getInputStream();
                    InputStreamReader inReader = new InputStreamReader(in);
                    BufferedReader buffRead = new BufferedReader(inReader);
                    while (true)
                    {
                        String chuoiNhan = buffRead.readLine();
                        System.out.println("Client: "+chuoiNhan);
                        String KQ = "";
                        switch (chuoiNhan) {
                                            case "0" -> KQ = "Zero";
                                            case "1" -> KQ = "One";
                                            case "2" -> KQ = "Two";
                                            case "3" -> KQ = "Three";
                                            case "4" -> KQ = "Four";
                                            case "5" -> KQ = "Five";
                                            case "6" -> KQ = "Six";
                                            case "7" -> KQ = "Seven";
                                            case "8" -> KQ = "Eight";
                                            case "9" -> KQ = "Nine";
                                            }
                        
                        System.out.println("Server: "+KQ);
                        bufferWrite.write(KQ+"\n");
                        bufferWrite.flush();
                        if (KQ.equals("10")) break;
                    }
                socketClient.close();
		}
            } catch (IOException e) {			
                    e.printStackTrace();
		}
    }
    
}
