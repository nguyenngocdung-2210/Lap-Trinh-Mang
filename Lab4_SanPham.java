/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Lab4_SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;
    //hàm tạo
    public Lab4_SanPham(String _tenSP, double _donGia, double _giamGia ){
        tenSP = _tenSP;
        donGia = _donGia;
        giamGia = _giamGia;
    }
    public Lab4_SanPham(String _tenSP, double _donGia){
        tenSP = _tenSP;
        donGia = _donGia;
        giamGia = 0;
    }
    //10% giá
    private double getThueNhapKhau(){
        return donGia*0.1;
    }
    //nhập dữ liệu
    public void nhap(){
        Scanner bp = new Scanner(System.in);
        System.out.println("Nhap ten SP: ");
        tenSP = bp.nextLine();
        System.out.println("Nhap don gia SP: ");
        donGia = bp.nextDouble();
        System.out.println("Nhap giam gia SP: ");
        giamGia = bp.nextDouble();
    }
    //xuất dữ liệu
    public void xuat(){
        System.out.println("Ten san pham: " + tenSP);
        System.out.println("Gia san pham: " + String.valueOf(donGia));
        System.out.println("Giam gia: " + String.valueOf(giamGia));
        System.out.println("Thue nhap khau: " + String.valueOf(getThueNhapKhau()));
    }
    
}
