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
public class square extends rectangle{
    // side: cạnh của hình vuông
    private double side;    
    //Constructor
    public square(){
        side = 1.0;
    }
    //Constructor
    public square(double side){
        this.side =side;
    }
    //Constructor
    public square(double side, String color, boolean filled){
        this.side =side;
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the side
     */
    public double getSide() {
        return side;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.side = side;
    }
    

    /**
     * @param width the width to set
     */
    public void setWidth(double side) {
        this.side = side;
    }
    /**
     * @param Length the length to set
     */
    public void setLength(double side) {
        this.side = side;
    }
    // toString 
    public String toString(){
        return "square";
    }
}
