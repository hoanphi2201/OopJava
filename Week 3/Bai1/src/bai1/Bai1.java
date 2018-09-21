/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author phixuanhoan
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public int GCD(int a, int b){
        while (a != b) {            
            if(a > b){
                a = a -b;
            }
            if( b > a){
                b = b - a;
            }
        }
        return a;
    }
    public int fibonaxi(int n){
        int[] arr = new int[1000];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        System.out.print(bai1.GCD(5,16));
        System.out.print(bai1.fibonaxi(10));
    }
    
}
