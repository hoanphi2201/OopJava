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
public class NhanVienSanXuat extends NhanVien{
    private int SoSanPham;
    public Scanner scan = new Scanner(System.in);
    public void Nhap(){
        //super gọi đến thằng cha của nó
        super.Nhap();
        System.out.println("Nhập số sản phẩm: ");
        SoSanPham = scan.nextInt();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Số sản phầm: " +SoSanPham);
    }
    public double TinhLuong(){
        return SoSanPham * 20000;
    }
//    public static void main(String[] args) {
//        NhanVienSanXuat nv = new NhanVienSanXuat();
//        nv.nhap();
//        nv.xuat();
//        System.out.print("Lương = " + nv.TinhLuong());
//    }
}
