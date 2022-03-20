/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi2;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author USER
 */
public class DocFileNhiPhan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //tạo đối tượng InputStream
        InputStream ist;
        //Tạo vào file
        FileInputStream FileIn = new FileInputStream("ngocdung.txt");
        //gắn ot vào Fout
        ist = FileIn;
        //Tạo và gắn vào DataOutputStream
        DataInputStream dtIn = new DataInputStream(FileIn);
        //Đọc dữ liệu
        int a = dtIn.readInt();
        double b = dtIn.readDouble();
        String chuoi = dtIn.readUTF();
        dtIn.close();
        ist.close();
        FileIn.close();
        System.out.println("Hoan thanh cong viec doc file!");
        System.out.println(a);
        System.out.println(b);
        System.out.println(chuoi);
    }
    
}
