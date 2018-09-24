/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dahinh;

/**
 *
 * @author phixuanhoan
 */
public class Bike {
    void run(){
        System.out.println("Đang chạy");
    }
}
class Splender extends Bike{
    void run(){
        System.out.println("Đang chạy với tốc độ 60km");
    }
    public static void main(String[] args) {
        Bike b = new Splender(); // upcasting
        b.run();
    }
}