/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan6;

/**
 *
 * @author phixuanhoan
 */
public class Triangle extends Shape{
    private Location l1 = new Location();
    private Location l2 = new Location();

    public Triangle() {
    }
    
    
    public Triangle(Location l1, Location l2) {
        this.l1 = l1;
        this.l2 = l2;
    }
    
    @Override
    public void input(){
        super.input();
        getL1().inPut();
        getL2().inPut();
     
    }
    @Override
    public void output(){
        System.out.println("===== Triangle =====");
        super.output();
        l1.outPut();
        l2.outPut();
    }
    
    public boolean sameTriangle(Triangle t2){
        if(this.l1.sameLocation(t2.l1) && this.l2.sameLocation(t2.l2) && l.sameLocation(t2.l)){
            return true;
        }
        return false;
    }

    /**
     * @return the l1
     */
    public Location getL1() {
        return l1;
    }

    /**
     * @param l1 the l1 to set
     */
    public void setL1(Location l1) {
        this.l1 = l1;
    }

    /**
     * @return the l2
     */
    public Location getL2() {
        return l2;
    }

    /**
     * @param l2 the l2 to set
     */
    public void setL2(Location l2) {
        this.l2 = l2;
    }

}
