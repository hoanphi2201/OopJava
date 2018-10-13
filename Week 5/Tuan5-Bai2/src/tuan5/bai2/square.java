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
    //Constructor
    public square(){
        this.width = this.length = 0;
    }
    //Constructor
    public square(double side){
        this.width = this.length = side;
    }
    //Constructor
    public square(double side, String color, boolean filled){
        this.width = this.length = side;
        this.color = color;
        this.filled = filled;
    }

    /**
     * @return the side
     */
    public double getSide() {
        return this.width;
    }

    /**
     * @param side the side to set
     */
    public void setSide(double side) {
        this.width = this.length = side;
    }
    

    @Override
    public void setWidth(double side) {
        this.width = this.length = side;    
    }
    @Override
    public void setLength(double side) {
        this.width = this.length = side;    
    }
    @Override
    public String toString(){
        return "square";
    }
}
