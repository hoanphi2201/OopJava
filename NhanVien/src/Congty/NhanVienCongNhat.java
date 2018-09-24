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
public class NhanVienCongNhat extends NhanVien{
    private int SoNgayCong;
    public Scanner scan = new Scanner(System.in);
    public void Nhap(){
        //super gọi đến thằng cha của nó
        super.Nhap();
        System.out.println("Nhập số ngày công: ");
        SoNgayCong = scan.nextInt();
    }
    public void Xuat(){
        super.Xuat();
        System.out.println("Số ngày công: " +SoNgayCong);
    }
    public double TinhLuong(){
        return SoNgayCong * 55000;
    }
//        public static void main(String[] args) {
//        NhanVienCongNhat nv = new NhanVienCongNhat();
//        nv.nhap();
//        nv.xuat();
//        System.out.print("Lương = " + nv.TinhLuong());
//    }
}
