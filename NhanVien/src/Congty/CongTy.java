/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Congty;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
public class CongTy {
    private ArrayList<NhanVien> NhanVien = new ArrayList();
    Scanner scan = new Scanner(System.in);
    public void Nhap(){
        int luachon ;
        do {            
            System.out.print("\n---------------------Menu -----------------------");
            System.out.print("\n1. Nhân viên công nhật");
            System.out.print("\n2. Nhân viên sản xuất");
            System.out.print("\n3. Nhân viên quản lý");
            System.out.print("\n4. Thoát");
            System.out.print("\n-------------------------------------------------");
            do {                
                System.out.print("\nNhập vào lựa chọn của bạn: ");
                luachon = scan.nextInt();
                if(luachon < 0 || luachon > 4){
                    System.out.print("Lựa chọn không hợp lệ");
                }
            } while (luachon < 0 || luachon > 4);
            
            if(luachon == 1){
                NhanVien nv = new NhanVienCongNhat();
                nv.Nhap();
                NhanVien.add(nv);
            }else if(luachon == 2){
                NhanVien nv = new NhanVienSanXuat();
                nv.Nhap();
                NhanVien.add(nv);
            }else if(luachon == 3){
                NhanVien nv = new NhanVienQuanLy();
                nv.Nhap();
                NhanVien.add(nv);
            }else if(luachon == 4){
                break;
            }
        } while (luachon != 0);
    }
    public void Xuat(){
        int soluong = NhanVien.size();
        for(int  i = 0; i < soluong; i++){
            System.out.println("\nNhân viên thứ: " + (i+1));
            NhanVien.get(i).Xuat();
        }
    }
    public double TinhTongLuongCongTy(){
        double tong = 0;
        int soluong = NhanVien.size();
        for(int i = 0; i <soluong; i++){
            tong += NhanVien.get(i).TinhLuong();
        }
        return tong;
    }
    public double TimLuongMax(){
        double max = NhanVien.get(0).TinhLuong();
        int soluong = NhanVien.size();
        for(int i = 1; i <soluong; i++){
            if(max < NhanVien.get(i).TinhLuong()){
                max = NhanVien.get(i).TinhLuong();
            }
        }
        return max;
    }
    public void LietKeNhanVienMaxLuong(){
        int soluong = NhanVien.size();
        double max = TimLuongMax();
        for(int i = 1; i <soluong; i++){
            if(max == NhanVien.get(i).TinhLuong()){
                NhanVien.get(i).Xuat();
            }
        }
    }
    public double TinhLuongNhanVienCongNhat(){
        int soluong = NhanVien.size();
        double luong = 0;
        for(int i = 0; i <soluong; i++){
            if(NhanVien.get(i) instanceof NhanVienCongNhat){
                luong += NhanVien.get(i).TinhLuong();
            }
        }  
        return luong;
    }
    public static void main(String[] args) {
        CongTy ct = new CongTy();
        ct.Nhap();
        ct.Xuat();
        //Tính tổng lương
        //System.out.println("Tổng lương công ty: " +ct.TinhTongLuongCongTy());
        //Xuất nhân viên có lương cao nhất
        //System.out.println("Các nhân viên có lương cao nhất: ");
        ///ct.LietKeNhanVienMaxLuong();
        
        System.out.print("Tổng luong nhân viên công nhật: " + ct.TinhLuongNhanVienCongNhat());
    }
}
