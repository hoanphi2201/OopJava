/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phixuanhoan
 */
public class Layer {
    private String nameLayer;
    private boolean visible;
    public ArrayList<Shape> layer = new ArrayList<Shape>();
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Nhập tên Layer: ");
        nameLayer = scan.nextLine();
        System.out.println("Nhập thuộc tính visible(true/false): ");
        visible = scan.nextBoolean();
        int luachon ;
        do {            
            System.out.print("\n---------------------Menu -----------------------");
            System.out.print("\n1. Circle");
            System.out.print("\n2. Rectangle");
            System.out.print("\n3. Square");
            System.out.print("\n4. Triangle");
            System.out.print("\n5. Hexagon");
            System.out.print("\n6. Thoát");
            System.out.print("\n-------------------------------------------------");
            do {                
                System.out.print("\nNhập vào lựa chọn của bạn: ");
                luachon = scan.nextInt();
                if(luachon < 0 || luachon > 6){
                    System.out.print("Lựa chọn không hợp lệ");
                }
            } while (luachon < 0 || luachon > 6);
            
            if(luachon == 1){
                Shape sh = new Circle();
                sh.input();
                layer.add(sh);
            }else if(luachon == 2){
                Shape sh = new Rectangle();
                sh.input();
                layer.add(sh);
            }else if(luachon == 3){
                Shape sh = new Square();
                sh.input();
                layer.add(sh);
            }else if(luachon == 4){
                Shape sh = new Triangle();
                sh.input();
                layer.add(sh);
            }else if(luachon == 5){
                Shape sh = new Hexagon();
                sh.input();
                layer.add(sh);
            }
            else if(luachon == 6){
                break;
            }
        } while (luachon != 0);
    }
    public void output(){
        System.out.println("Tên của layer: " +getNameLayer());
        for(int i = 0; i < layer.size(); i++){
            layer.get(i).output();
        }
    }
    public void removeTriangle(){
        for(int i = 0; i < layer.size(); i++){
            if(getLayer().get(i) instanceof Triangle){
                getLayer().remove(i);
                i--;
            }
        }
    }
     public void removeCircle(){
        for(int i = 0; i < layer.size(); i++){
            if(getLayer().get(i) instanceof Circle){
                getLayer().remove(i);
                i--;
            }
        }
    }
     public boolean sameShape(Shape s1, Shape s2){
         if(s1 instanceof Circle && s2 instanceof Circle){
             if(((Circle)s1).sameCircle((Circle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Rectangle && s2 instanceof Rectangle){
             if(((Rectangle)s1).sameRectangle((Rectangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Square && s2 instanceof Square){
             if(((Square)s1).sameSquare((Square)s2)){
                 return true;
             }
         }
          if(s1 instanceof Triangle && s2 instanceof Triangle){
             if(((Triangle)s1).sameTriangle((Triangle)s2)){
                 return true;
             }
         }
          if(s1 instanceof Hexagon && s2 instanceof Hexagon){
             if(((Hexagon)s1).sameHexagon((Hexagon)s2)){
                 return true;
             }
         }
         return false;
     }
     public void removeSameShape(){
         for(int i = 0; i < layer.size(); i++){
             for(int j = i + 1; j < layer.size(); j++){
                 if(sameShape(layer.get(i), layer.get(j)) == true){
                    layer.remove(j);
                    j--;
                 }
             }
         }
     }
    /**
     * @return the layer
     */
    public ArrayList<Shape> getLayer() {
        return layer;
    }

    /**
     * @param aLayer the layer to set
     */
    public void setLayer(ArrayList<Shape> aLayer) {
        layer = aLayer;
    }


    /**
     * @return the nameLayer
     */
    public String getNameLayer() {
        return nameLayer;
    }

    /**
     * @param nameLayer the nameLayer to set
     */
    public void setNameLayer(String nameLayer) {
        this.nameLayer = nameLayer;
    }

    /**
     * @return the visible
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * @param visible the visible to set
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    public static void main(String[] args) {
        Layer l = new Layer();
        l.input();
        l.removeSameShape();
//        System.out.print(l.sameShape(l.layer.get(0), l.layer.get(1)));
       
        l.output();
        
    }
}
