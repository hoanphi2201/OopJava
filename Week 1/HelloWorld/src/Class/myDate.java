/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author phixuanhoan
 */
public class myDate {
    private int day;
    private int month;
    private int year;
    public myDate(){
        day = 0;
        month = 0;
        year = 0;
    }
    public myDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
        
    }
    public myDate(myDate d){
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }
    public void printInfo(){
        System.out.print(day);
        System.out.print(month);
        System.out.print(year);
    }
    public static void main(String[] args) {
        myDate d1 = new myDate(1,1,1);
        myDate d2 = new myDate(d1);
        d2.printInfo();
    }
}
