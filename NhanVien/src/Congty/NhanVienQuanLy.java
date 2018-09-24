/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Congty;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
public class NhanVienQuanLy extends NhanVien{
    private double HeSoLuong;
    private double LuongCanBan;
    public Scanner scan = new Scanner(System.in);
    public void Nhap(){
        //super gọi đến thằng cha của nó
        super.Nhap();
        System.out.println("Nhập hệ số lương: ");
        HeSoLuong = scan.nextDouble();
        System.out.println("Nhập lương căn bán: ");
        LuongCanBan = scan.nextLong();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Hệ số lương: " + HeSoLuong);
        System.out.println("Lương căn bản: " + LuongCanBan);
    }
    public double TinhLuong(){
        //Trong c/c++(size_t) để không bị lỗi
        return HeSoLuong * LuongCanBan;
    }
//        public static void main(String[] args) {
//        NhanVienQuanLy nv = new NhanVienQuanLy();
//        nv.nhap();
//        nv.xuat();
//        System.out.print("Lương = " + nv.TinhLuong());
//    }
}
