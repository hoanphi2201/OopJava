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
public class rectangle extends shape{
    protected double width;
    protected double length;

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }
     public rectangle(){
        width = 1.0;
        length = 1.0;
    }
     public rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
     public rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
        
    }
     public double getArea(){
         return width*length;
     }
     public double getPerimeter(){
         return 2*(width + length);
     }
     public String toString(){
         return "rectanle";
     }
     
     
     
}
