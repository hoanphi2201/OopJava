package tuan4;

/**
 *
 * @author phixuanhoan
 */
public class testJunit {
    //Max two number return int
    public static int Max(int a, int b){
        return a > b ? a : b;
    }
    //Min array return int
    public static int MinArr(int[] arr){
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    //MBI return String
    public static String BMI(double weight, double height){
        double bmi = weight / (height*height);
        if(bmi < 18.5){
            return ("Thiếu cân");
        }
        else if(bmi >= 18.5 && bmi <= 22.99){
            return ("Bình thường");
        }
        else if (bmi >= 23 && bmi <= 24.99){
            return ("Thừa cân");
        }
        else if(bmi > 25){
            return ("Béo phì");
        }
        return null;
        
    }
}
