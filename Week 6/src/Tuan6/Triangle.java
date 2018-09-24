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
    private int a;
    private int b;
    private int c;
    
    public void input(){
        super.input();
        System.out.println("Nhập cạnh thứ nhất: ");
        a = super.scan.nextInt();
        System.out.println("Nhập cạnh thứ hai: ");
        b = super.scan.nextInt();
        System.out.println("Nhập cạnh thứ ba: ");
        c = super.scan.nextInt();
    }
    public void output(){
        System.out.println("===== Triangle =====");
        super.output();
        System.out.println("Chiều dài cạnh thứ nhất: " + a);
        System.out.println("Chiều dài cạnh thứ hai: " + b);
        System.out.println("Chiều dài cạnh thứ ba: " + c);

    }
    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }
    public boolean sameTriangle(Triangle t2){
        if(x == t2.x && y == t2.y && a == t2.a && b == t2.b && c == t2.c){
            return true;
        }
        return false;
    }
    
}
