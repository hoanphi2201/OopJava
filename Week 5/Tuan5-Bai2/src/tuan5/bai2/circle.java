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
public class circle extends shape{
    private double radius;
    final private double PI = 3.14;
    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public circle(){
        radius = 1.0;
    }
    public circle(double radius){
        this.radius =radius;
    }
    public circle(double radius, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
        
    }
    public double getArea(){
        return PI*(radius*radius);
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    public String toString(){
        return "circle";
    }
}
