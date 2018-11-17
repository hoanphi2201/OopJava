/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author phixuanhoan
 */
public class BubbleSort {
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
     public static void sort(Comparable[] a) {
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = n -1 ; j > i; j--) {
                if(!less(a[j - 1], a[j])) {
                    exch(a, j-1, j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Double[] a = new Double[1000];
        Random rd = new Random();
        for(int i = 0; i < 1000; i++) {
            a[i] = rd.nextDouble() * 200;
        }
        BubbleSort.sort(a);
        for(int  i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
