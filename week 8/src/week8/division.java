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
public class division extends binaryExpression{
    public division(expression Left, expression Right){
        this.left   = Left;
        this.right  = Right;
    }
    @Override
    public String toString(){
         String rs;
        if(left instanceof square || left instanceof division || 
                left instanceof numeral || left instanceof multiplication) {
            rs = left.toString() + " / ";
        } else {
            rs = "(" + left.toString() + ") / ";
        }
        if(right instanceof numeral || right instanceof square || right instanceof multiplication) {
            rs += right.toString();
        } else {
            rs += ("(" + right.toString() + ")");
        }
        return rs;
    }
     @Override
    public int evaluate() {
        return left.evaluate() / right.evaluate();
    }
}
