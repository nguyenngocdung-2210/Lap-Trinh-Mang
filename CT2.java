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
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author USER
 */
public class CT2 {

    /**sử dụng đối tượng URLConnection đọc mã nguồn HTML trang web
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String chuoiURL="https://ntu.edu.vn/Gioi-thieu/Tham-quan-Truong-qua-video";
        URL u = new URL(chuoiURL);
        // mở kết nối
        URLConnection urlCon = u.openConnection();
        urlCon.connect();
        //lấy về luồng nhập
        InputStream in = urlCon.getInputStream();
        InputStreamReader inR = new InputStreamReader(in);
        BufferedReader buff = new BufferedReader(inR);
        String lineHTML;
        while (buff.readLine() !=null){
            lineHTML = buff.readLine();
            if (lineHTML == null)
                break;
            else
                System.out.println(lineHTML);
        }
        
        
        buff.close();
        in.close();
        inR.close();
    }
    
}
