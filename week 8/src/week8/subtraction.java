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
public class subtraction extends binaryExpression{
    public subtraction(expression Left,expression Right){
        this.left   = Left;
        this.right  = Right;
    }
   
    @Override
    public String toString(){
        return left.toString() + " - " + right.toString();
    }
    @Override
    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }
}
