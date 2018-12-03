/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author phixuanhoan
 */
public class Sort {
    static int[] arr;
    SortType sortType;

    public Sort(int[] a, SortType type) {
        arr = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        sortType =  type;
    }
    public String toString(){
        return Arrays.toString(arr);
    }
    public interface SortType {
        public void sort();
    }
    public static class Bubble implements SortType {
        @Override
        public void sort() {
            for(int i = 0; i < arr.length - 1; i++ ) {
                for(int j = 0; j < arr.length - i - 1; j++) {
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
    public static class Selection implements SortType {
        @Override
        public void sort() {
            for(int i = 0; i < arr.length - 1; i++ ) {
                int min = i;
                for(int j = i+1; j < arr.length; j++) {
                    if(arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            } 
        }
    }
    public static void main(String[] args) {
        int[] a = {1,3,7,2,9,8,5,0};
        SortType type = new Selection();
        Sort s = new Sort(a, type);
        s.sortType.sort();
        System.out.println(s.toString());
        
    }
    
}

