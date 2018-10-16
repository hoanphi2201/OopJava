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
public class Square extends Shape{
    Location l1 = new Location();
    Location l2 = new Location();
    Location l3 = new Location();
    public void input(){
        super.input();
        l1.inPut();
        l2.inPut();
        l3.inPut();

    }
    public void output(){
        System.out.println("===== Rectangle =====");
        super.output();
        l1.outPut();
        l2.outPut();
        l3.outPut();
    }
    public boolean sameSquare(Square s2) {
        if (this.l1.sameLocation(s2.l1) && this.l2.sameLocation(s2.l2)
           && this.l3.sameLocation(s2.l3) && l.sameLocation(s2.l)) {
            return true;
        }

        return false;
    }
}
