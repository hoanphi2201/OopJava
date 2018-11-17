/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author phixuanhoan
 */
public class Prac2 {

    public static <E extends Comparable<E>> E maxValueArray(ArrayList<E> a) {
        E max = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        Random rd = new Random();
        for(int i = 0; i < 10; i++) {
            int ele = rd.nextInt(100);
            arr.add(ele);
            System.out.println(ele);
        }
        System.out.println("Max:" + maxValueArray(arr));
        
    }
}
