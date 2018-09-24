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
    private int Length;
    public void input(){
        super.input();
        System.out.println("Nhập chiều dài cạnh: ");
        Length = super.scan.nextInt();
    }
    public void output(){
        System.out.println("===== Square =====");
        super.output();
        System.out.println("Chiều dài cạnh: " + Length);
    }
    /**
     * @return the Width
     */
    /**
     * @return the Length
     */
    public int getLength() {
        return Length;
    }

    /**
     * @param Length the Length to set
     */
    public void setLength(int Length) {
        this.Length = Length;
    }
    public boolean sameSquare(Square s2){
        if(x == s2.x && y == s2.y && Length == s2.Length){
            return true;
        }
        return false;
    }
}
