/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan5.bai2;

/**
 *
 * @author phixuanhoan
 */
public class application2 {
    public static void main(String[] args) {
        circle circle = new circle(3);
        System.out.println("Diện tích hình tròn: " +circle.getArea());
        System.out.println("Chu vi hình tròn: " +circle.getPerimeter());
        
        rectangle rectangle  = new rectangle(10, 20);
        System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
        System.out.println("Diện tích hình tròn: " +rectangle.getPerimeter());
        
        square square  = new square(20);
        System.out.println("Diện tích hình vuông: " + square.getArea());
        System.out.println("Diện tích hình vuông: " +square.getPerimeter());
        
    }
}
