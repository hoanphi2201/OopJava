/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Congty;

import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
 // abstract ko được new đối tượng(mục đích làm cho nó chỉ để kế thừa)
 // abstact đối với phương thức sẽ dùng để định nghĩa hàm và mọi hàm con sẽ
 // override lại (mục đích để bắt mọi hàm con đều phải overide lại)
public abstract class NhanVien {
    protected String ma;
    protected String hoten;
    protected String ngaysinh;
    protected String diachi;
    public Scanner scan = new Scanner(System.in);
    /**
     * @return the ma
     */
    public void Nhap(){
        System.out.println("Nhap ma so: ");
        ma = scan.nextLine();
        
        System.out.println("Nhap ho ten: ");
        hoten = scan.nextLine();
        
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = scan.nextLine();
        
        System.out.println("Nhap dia chi: ");
        diachi = scan.nextLine();
        
    }
    public void Xuat(){
        System.out.println("Mã số: " + ma);
        System.out.println("Họ tên: " + hoten);
        System.out.println("Ngày sinh: " + ngaysinh);
        System.out.println("Địa chỉ: " +diachi);
    }
    public abstract double TinhLuong();
    public String getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(String ma) {
        this.ma = ma;
    }

    /**
     * @return the hoten
     */
    public String getHoten() {
        return hoten;
    }

    /**
     * @param hoten the hoten to set
     */
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    /**
     * @return the ngaysinh
     */
    public String getNgaysinh() {
        return ngaysinh;
    }

    /**
     * @param ngaysinh the ngaysinh to set
     */
    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    /**
     * @return the diachi
     */
    public String getDiachi() {
        return diachi;
    }

    /**
     * @param diachi the diachi to set
     */
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
//    public static void main(String[] args) {
//        NhanVien nv = new NhanVien();
//        nv.Nhap();
//        nv.Xuat();
//    }
}
