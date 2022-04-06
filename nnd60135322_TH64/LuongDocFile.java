/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nnd60135322_TH64;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import kt.LuongDich;

/**
 *
 * @author USER
 */
public class LuongDocFile extends Thread{
    Socket socketClient;
    int id = -1;
    public LuongDocFile(Socket socketClient, int id){
        super();
        this.socketClient = socketClient;
        this.id = id;
    }
    void GuiFile(String tenFile) throws IOException {
        //Lấy về nhập từ file
        FileReader fr = new FileReader(tenFile);
        BufferedReader bufRead = new BufferedReader(fr);
        //Lấy về luồng xuất( để gửi về client)
        OutputStream osToClient = socketClient.getOutputStream();
        OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
        BufferedWriter buffWrite = new BufferedWriter(write2Client);
        // đọc từng dòng
        String line;
        while((line = bufRead.readLine()) != null){
            //Gửi về
            buffWrite.write(line);
            buffWrite.flush();
            System.out.println(line);
        }
        fr.close();
    }
    @Override
    public void run(){
        try {
            System.out.println(socketClient.getInetAddress().getHostAddress());
            System.out.println(id);
        
            // lấy về luồng xuất nhập
//            OutputStream osToClient = socketClient.getOutputStream();
//            OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
//            BufferedWriter buffWrite  = new BufferedWriter(write2Client);

            InputStream in = socketClient.getInputStream();
            InputStreamReader inReader = new InputStreamReader(in);
            BufferedReader buffRead = new BufferedReader(inReader);
            ///
            while (true)
                    {
                        String chuoiNhan = buffRead.readLine();
                        System.out.println("Client: "+chuoiNhan);
                        switch (chuoiNhan) {
                                            case "1" -> GuiFile("D:\\file1.txt");
                                            case "2" -> GuiFile("D:\\file2.txt");
                                            case "3" -> GuiFile("D:\\file3.txt");
                                            case "4" -> GuiFile("D:\\file4.txt");
                                            case "5" -> GuiFile("D:\\file5.txt");
                                            case "6" -> GuiFile("D:\\file6.txt");
                                            case "7" -> GuiFile("D:\\file7.txt");
                                            case "8" -> GuiFile("D:\\file8.txt");
                                            case "9" -> GuiFile("D:\\file9.txt");
                                            }
                        break;
            }
            socketClient.close();
        } catch (IOException ex) {
            Logger.getLogger(LuongDocFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}