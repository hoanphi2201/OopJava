/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week_Ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author phixuanhoan
 */
public class Exception {
    public String cutName(String s) throws NullPointerException {
        return s.substring(4, 6);
    }
    public int lastElement(int[] arr) throws ArrayIndexOutOfBoundsException {
        return arr[arr.length];
    }
    public int division(int x, int y) throws ArithmeticException {
        return x / y;
    }
    public int parseInt(Object s) throws ClassCastException {
        return (Integer) s;
    }
    public void readFile(String filename) throws FileNotFoundException{
        BufferedReader br;
        FileReader f = new FileReader(filename);
        br = new BufferedReader(f);
        System.out.println(br.lines());
    }
    public void writeFile(String filename, String s) throws  IOException{
        File file = new File(filename);
        PrintWriter out = new PrintWriter(file);
        out.println(s);
    }
    public static void main(String[] args) {
        try {
            String s = new Exception().cutName(null);
            System.out.println(s);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            System.out.println(new Exception().lastElement(new int [] {0,1,2,3}));
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            System.out.println(new Exception().division(1,0));
        } catch(ArithmeticException e) {
            System.out.println(e);
        }
        try {
            System.out.println(new Exception().parseInt("100"));
        } catch (ClassCastException e) {
            System.out.println(e);
        }
        
        try {
            new Exception().readFile("dictionary.txt");
        } catch(FileNotFoundException ex) {
            System.out.println(ex);
        } 
        try {
            new Exception().writeFile("dictionary.txt", null);
        } catch(IOException ex) {
            System.out.println(ex);
        } 
    }
}
