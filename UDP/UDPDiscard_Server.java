/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author USER
 */
public class UDPDiscard_Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Lắng nge cổng 9
	DatagramSocket server = new DatagramSocket(9);
	// chuẩn bị vùng nhớ để nhận gói
	byte[] buffer = new byte[1000];
	DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
	while(true) {
                        // nhận về, đưa vào UDP
			server.receive(packet);
			//trích thong tin ra, mảng byte data nhận đc thành chuỗi
			// từ byte đầu tiên ----> byte cuối cùng
			String s = new String(packet.getData(), 0, packet.getLength());
			// In ra màn hình thông tin
			System.out.println("UDP Server:" +  packet.getAddress() + " at port"
			                   + packet.getPort() + " says " + s);
			
	}
    }
    
}
