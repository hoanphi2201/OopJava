/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4;

/**
 *
 * @author phixuanhoan
 */
public class testJunit {
    public static int Max(int a, int b){
        return a > b ? a : b;
    }
    public static int MinArr(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void BMI(double weight, double height){
        double bmi = weight / height;
        if(bmi < 18.5){
            System.out.println("Thiếu cân");
        }
        if(bmi >= 18.5 && bmi < 24.99){
            System.out.println("Bình thường");
        }
        if (bmi >= 23 && bmi < 24.99){
            System.out.println("Thừa cân");
        }
        if(bmi > 25){
            System.out.println("Béo phì");
        }
        
    }
}
