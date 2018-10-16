package Tuan6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phixuanhoan
 */
public class Circle extends Shape{
    private int Radius;
    public void input(){
        super.input();
        System.out.println("Nhập vào bán kính");
        Radius = super.scan.nextInt();
    }
    public void output(){
        System.out.println("===== Circle =====");
        super.output();
        System.out.println("Bán kính: " +Radius);
    }
    /**
     * @return the Radius
     */
    public int getRadius() {
        return Radius;
    }
    //2 hình giống nhau trả về true
    public boolean sameCircle(Circle c){
        if(this.l.sameLocation(c.l) && Radius == c.Radius){
            return true;
        }
        return false;
    }
    /**
     * @param Radius the Radius to set
     */
    public void setRadius(int Radius) {
        this.Radius = Radius;
    }
}
