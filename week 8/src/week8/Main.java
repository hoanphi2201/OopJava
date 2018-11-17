/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author phixuanhoan
 */
public class Main {
    public static void main(String[] args) {
        expression ex1 = new square(new numeral(20));
        expression ex2 = new subtraction(ex1, new numeral(3));
        expression ex3 = new addition(ex2, new division(new numeral(2), new numeral(0)));
        expression ex = new square(ex3);
        System.out.println(ex.toString());
        try {
            System.out.println(ex.evaluate());
        } catch (ArithmeticException ae) {
            System.out.println("Lỗi chia cho 0");
        }
    }
      
}
