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
public class numeral extends expression{
    private int value;
    public numeral(){
        value = 0;
    }
    public numeral(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return Integer.toString(value);
    }
    
    @Override
    public int evaluate(){
        return getValue();
    }
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
}
