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
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Socket soc;
            try {
                    soc = new Socket("localhost",9999);
                    System.out.print("Connected!\n");
                    InputStream in = soc.getInputStream();
                    InputStreamReader inReader = new InputStreamReader(in);
                    BufferedReader buffRead = new BufferedReader(inReader);
                    OutputStream osToClient = soc.getOutputStream();
                    OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
                    BufferedWriter buffWriter = new BufferedWriter(write2Client);
                    Scanner banphim = new Scanner(System.in);
                    while(true)
                    {
                        System.out.println("\nClient:");
                        String chuoiGui = banphim.nextLine();
                        buffWriter.write(chuoiGui+"\n");
                        buffWriter.flush();
                        String chuoiNhan = buffRead.readLine();
                        System.out.print("Server:" + chuoiNhan);

                        if(chuoiGui.equals("10")) break;
                    }
                    soc.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
}
