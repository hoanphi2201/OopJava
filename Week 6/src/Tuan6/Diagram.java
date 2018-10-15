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
public class Diagram {
    
    //1 mảng arraylisst layer vì diagram chứa nhiều layer
    Layer lCircle = new Layer();
    Layer lRectangle = new Layer();
    Layer lSquare = new Layer();
    Layer lTriangle = new Layer();
    Layer lHexagon = new Layer();
    
    
    ArrayList<Layer> listLayer = new ArrayList<Layer>();
    public void removeCircleInLayer(){
        for(int i = 0; i < listLayer.size(); i++){
            listLayer.get(i).removeCircle();
        }
    }
    public void input(int n){
        for(int i = 0; i < n; i++){
            System.out.println("----------------- Thông tin layer "+ (i + 1)+" --------------- ");
            Layer layer = new Layer();
            layer.input();
            listLayer.add(layer);
        }
    }
    public void output(){
        
        for(int i = 0; i < listLayer.size(); i++){
            if(listLayer.get(i).isVisible() == false){
                listLayer.get(i).output();
            }
        }
    }
    public void moveShapeToLayer(){
        lCircle.setNameLayer("====Layer Circle ====");
        lRectangle.setNameLayer("==== Layer Ractangle ====");
        lSquare.setNameLayer("==== Layer Square ====");
        lTriangle.setNameLayer("==== Layer Triangle ====");
        lTriangle.setNameLayer("==== Layer Hexagon ====");
        for(int i = 0; i < listLayer.size(); i++){
            for(int j = 0; j < listLayer.get(i).layer.size(); j++){
                if(listLayer.get(i).layer.get(i) instanceof Circle){
                    lCircle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Rectangle){
                    lRectangle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Square){
                    lSquare.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Triangle){
                    lTriangle.layer.add(listLayer.get(i).layer.get(i));
                }else if(listLayer.get(i).layer.get(i) instanceof Hexagon){
                    lHexagon.layer.add(listLayer.get(i).layer.get(i));
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số layer");
        int n = sc.nextInt();
        Diagram dg = new Diagram();
        dg.input(n);
        dg.removeCircleInLayer();
        dg.output();
    }
}
