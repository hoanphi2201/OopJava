/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author phixuanhoan
 */
public class Shape {
    private int x;
    private int y;

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
    //VẼ
    public void draw(){
        
    }
    //Xoá
    public void erase(){
        
    }
    //Di chuyển
    public void moveTo(int _x, int _y){
        erase();
        x = _x;
        y = _y;
        draw();
    } 
}
