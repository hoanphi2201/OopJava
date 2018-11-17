/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;

/**
 *
 * @author phixuanhoan
 */
class Prac1 {
    private static  class  ListNode < T extends Comparable > {
        public ArrayList<T> data;
        public ListNode() {
            //data = new ArrayList<T>();
        }
        
        public void add(T val) {
            data.add(val);
        }
        public void sort() {
            for (int i = 0; i < data.size(); i++) {
                for (int j = 0; j < data.size(); j++) {
                    if (data.get(i).compareTo(data.get(j)) > 0) {
                        T temp = data.get(i);
                        data.set(i, data.get(j));
                        data.set(j, temp);
                    }
                }
            }
        }
       
    }
   
    public static void main(String[] args) {
        int[] a = {1,2,3,5,9,4};
        ListNode list = new ListNode();
        for(int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.sort();
        for(int  i = 0; i < list.data.size(); i++){
            System.out.println(list.data.get(i));
        }
        
    }  
}
