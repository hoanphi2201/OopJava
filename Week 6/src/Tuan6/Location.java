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
public class Location {
    Scanner sc = new Scanner(System.in);
    private int x;
    private int y;

    public Location() {
        x = 0;
        y = 0;
    }
    
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void inPut(){
        System.out.println("Nhập toạ độ x : ");
        x = sc.nextInt();
        System.out.println("Nhập toạ độ y : ");
        y = sc.nextInt();
        
    }
    public void outPut(){
        System.out.println("Toạ độ x : " + x + " toạ độ y: " + y);
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
    public boolean sameLocation(Location l){
        if(this.x == l.x && this.y == l.y){
            return true;
        }
        return false;
    }
    
}
