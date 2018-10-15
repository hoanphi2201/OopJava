/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan6;

import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
 //Các hình có thể được tô màu hoặc được di chuyển
public abstract class Shape {
    Scanner scan = new Scanner(System.in);
    protected int x;
    protected int y;
    //Định nghĩa 2 phương thức abstract để bắt các lớp có 2 phương thức này
    public void input(){
        System.out.println("Nhập toạ độ x");
        x = scan.nextInt();
        System.out.println("Nhập toạ độ y");
        y = scan.nextInt();
        
    }
    public void output(){
        System.out.println("Toạ độ x: " + x);
        System.out.println("Toạ độ y: " + y);
    }
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void paint(){
        
    }
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the width
     */
}
