/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dahinh;
/**
 *
 * @author phixuanhoan
 * thực chất là vitural table khi lớp con được ghi đè nó sẽ gọi hàm của lớp con
 * hàm thuần ảo abstract
 * hàm thuần ảo là hàm chỉ được khai báo, lớp cha chỉ khai báo lớp con định 
 * hàm thuần ảo bắt buộc có bao nhiêu lớp con thì phải định nghĩa ở đó
 * 2 trường hợp nên dùng hàm ảo hoặc thuần ảo:
 * + Hàm ảo thì khi hàm con không định nghĩa sẽ gọi về lớp con. nhưng có tình huống 
 * ví dụ con vật thì hàm tiếng kêu ta ko biết nó kêu thế nào cả
 * + Hàm thuần ảo thì chỉ khai báo còn các lớp con sẽ định nghĩa nhưng tất cả lớp 
 * con phải định nghĩa còn lớp con nào ko làm sẽ phát sinh lỗi
 * ===> Nên dùng hàm ảo hay hàm thuần ảo: 
 * 
 * 
 * 
 */
public class Animal {
    void tiengKeu(){
        System.out.println("Đại học công nghệ");
    }
}
class Cat extends Animal{
    void tiengKeu(){
        System.out.println("Meo meo !");
    }
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1 = new Cat();
        a1.tiengKeu();
    }
}
class Dog extends Animal{
    void tiengKeu(){
        System.out.println("Gâu gâu !");
     }
        
}
