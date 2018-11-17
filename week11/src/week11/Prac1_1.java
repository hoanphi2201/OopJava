package week11;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phixuanhoan
 */
public class Prac1_1 {
    public static <E> void swap(E[] a, int i, int j) {
        if(i != j ){
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
    public static <E extends Comparable<E>> void selectionSort(E[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i + 1; j < a.length; j++) {
                if(a[j].compareTo(a[min]) <= 0 ) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }
    public static void main(String[] args) {
        Integer[] arr = {5,9,1,4,2,3,10,15};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
