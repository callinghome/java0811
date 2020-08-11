
package com.pcschool.java0811.ocp.d01;

public class PetStore {
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        //dog 資料設定
        d1.type   ="拉不拉多";
        d1.amount =30;
        d1.price  =5000;
        d1.age    =5;
        d2.type   ="拉不拉多";
        d2.amount =20;
        d2.price  =3000;
        d2.age    =2;
        d3.type   ="拉不拉多";
        d3.amount =10;
        d3.price  =8000;
        d3.age    =4;
        //dog 印出
        System.out.printf("品種:%s 個數:%d 價格:%,d 年齡:%d 小計:%,7d\n", d1.type, d1.amount, d1.price, d1.age, d1.amount*d1.price);
        System.out.printf("品種:%s 個數:%d 價格:%,d 年齡:%d 小計:%,7d\n", d2.type, d2.amount, d2.price, d2.age, d2.amount*d2.price);
        System.out.printf("品種:%s 個數:%d 價格:%,d 年齡:%d 小計:%,7d\n", d3.type, d3.amount, d3.price, d3.age, d3.amount*d3.price);
        System.out.printf("總資產:%,d", d1.amount*d1.price + d2.amount*d2.price + d3.amount*d3.price);
    }
}
