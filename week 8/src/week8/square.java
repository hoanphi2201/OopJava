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
public class square extends expression{
    public expression ex;
    public square(expression e){
        this.ex = e;
    }
    @Override
    public String toString(){
        if(ex instanceof numeral) {
            return ex.toString() + "^2";
        } else {
            return "(" + ex.toString() + ")^2";
        }
    }
    @Override
    public int evaluate() {
        return new multiplication(ex, ex).evaluate();
    }
}
