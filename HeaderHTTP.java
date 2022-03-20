/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi3;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author USER
 */
public class HeaderHTTP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String chuoiURL="https://ntu.edu.vn/Gioi-thieu/Tham-quan-Truong-qua-video";
        URL u = new URL(chuoiURL);
        // mở kết nối
        URLConnection urlCon = u.openConnection();
        urlCon.connect();
        //lấy thông tin Hearder
        System.out.println("ContentType: "+ urlCon.getContentType());
    }
    
}
