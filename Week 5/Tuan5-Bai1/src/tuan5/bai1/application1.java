/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5.bai1;

/**
 *
 * @author phixuanhoan
 */
public class application1 {
    public static void main(String[] args) {
        HoaQua hoaQua = new HoaQua();
        
        QuaCam quaCam = new QuaCam();
        System.out.println(quaCam.toString());
        QuaTao quaTao = new QuaTao();
        System.out.println(quaTao.toString());
        CamCaoPhong camCaoPhong = new CamCaoPhong();
        System.out.println(camCaoPhong.toString());
        CamSanh camSanh = new CamSanh();
        System.out.println(camSanh.toString());
    }
}
