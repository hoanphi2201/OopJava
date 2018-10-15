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
public class Rectangle extends Shape{
    private int Width;
    private int Height;
    public void input(){
        super.input();
        System.out.println("Nhập chiều dài: ");
        setHeight(super.scan.nextInt());
        System.out.println("Nhập chiều rộng: ");
        Width = super.scan.nextInt();
    }
    public void output(){
        System.out.println("===== Rectangle =====");
        super.output();
        System.out.println("Chiều dài: " + getHeight());
        System.out.println("Chiều rộng: " + Width);
    }
    /**
     * @return the Width
     */
    public int getWidth() {
        return Width;
    }

    /**
     * @param Width the Width to set
     */
    public void setWidth(int Width) {
        this.Width = Width;
    }

    /**
     * @return the Height
     */
    public int getHeight() {
        return Height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(int Height) {
        this.Height = Height;
    }
    public boolean sameRectangle(Rectangle r2) {
        if (x == r2.x && y == r2.y && Width == r2.Width && Height == r2.Height) {
            return true;
        }

        return false;
    }
    /**
     * @return the Length
     */
    
}
