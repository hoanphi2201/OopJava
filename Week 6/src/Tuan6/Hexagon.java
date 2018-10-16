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
public class Hexagon extends Shape{
    Location l1 = new Location();
    Location l2 = new Location();
    Location l3 = new Location();
    Location l4 = new Location();
    Location l5 = new Location();
    @Override
    public void input(){
        super.input();
        l1.inPut();
        l2.inPut();
        l3.inPut();
        l4.inPut();
        l5.inPut();
    }
    public void output(){
        System.out.println("===== Hexagon =====");
        super.output();
        l1.outPut();
        l2.outPut();
        l3.outPut();
        l4.outPut();
        l5.outPut();
    }
    public boolean sameHexagon(Hexagon s2){
        if(this.l1.sameLocation(s2.l1) && this.l2.sameLocation(s2.l2)
           && this.l3.sameLocation(s2.l3) && this.l4.sameLocation(s2.l4)
           && this.l5.sameLocation(s2.l5) && l.sameLocation(s2.l)){
            return true;
        }
        return false;
    }
}
