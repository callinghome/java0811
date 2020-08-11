
package com.pcschool.java0811.ocp.d01;

public class PetStore {
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        //dog 資料設定
        d1.type="拉不拉多";
        d1.amount=30;
        d1.price=5000;
        d1.age=5;
        d2.type="拉不拉多";
        d2.amount=20;
        d2.price=3000;
        d2.age=2;
        d3.type="拉不拉多";
        d3.amount=10;
        d3.price=8000;
        d3.age=4;
        //dog 印出
        System.out.printf("%s %d %d %d", d1.type, d1.amount, d1.price, d1.age);
        System.out.printf("%s %d %d %d", d2.type, d2.amount, d2.price, d2.age);
        System.out.printf("%s %d %d %d", d3.type, d3.amount, d3.price, d3.age);
    }
}
