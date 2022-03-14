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
public class Lab4_HangHoa {
    private String tenHH;
	private double donGia;
	private double giamGia;
	
	/**
	 * @param tenHH
	 * @param donGia
	 * @param giamGia
	 */
	public Lab4_HangHoa(String tenHH, double donGia, double giamGia) {
		super();
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}
	/**
	 * @param tenHH
	 * @param donGia
	 */
	public Lab4_HangHoa(String tenHH, double donGia) {
		super();
		this.tenHH = tenHH;
		this.donGia = donGia;
		this.giamGia = 0;
	}
	public String getTenHH() {
		return tenHH;
	}
	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}
	
	
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	
	
	public double getGiamGia() {
		return giamGia;
	}
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}
}
