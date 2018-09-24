/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dahinh;

/**
 *
 * @author phixuanhoan
 */
class Bank {
    int getRateOfInterest(){
        return 0;
    }
}
class VCB extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class AGR extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}
class BIDV extends Bank{
    int getRateOfInterest(){
        return 6;
    }   
}
class Test{
    public static void main(String[] args) {
        Bank b1 = new VCB();
        Bank b2 = new AGR();
        Bank b3 = new BIDV();
        
        System.out.println("Lãi xuất của VCB: " + b1.getRateOfInterest());
        System.out.println("Lãi xuất của AGR: " + b2.getRateOfInterest());
        System.out.println("Lãi xuất của BIDV: " + b3.getRateOfInterest());

    }
}
