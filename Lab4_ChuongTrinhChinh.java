/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

/**
 *
 * @author USER
 */
public class Lab4_ChuongTrinhChinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Lab4_SanPham sp1 = new Lab4_SanPham();
        Lab4_SanPham sp2 = new Lab4_SanPham();*/
        Lab4_SanPham sp1 = new Lab4_SanPham("Ban Phim",1000000, 0.2);
        Lab4_SanPham sp2 = new Lab4_SanPham("Chuot", 200000);
        /*sp1.nhap();
        sp2.nhap();*/
        sp1.xuat();
        sp2.xuat();
    }
    
}
