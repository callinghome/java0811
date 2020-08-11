package com.pcschool.java0811.ocp.d01;

public class PetStore2 {
    
    public static void main(String[] args) {
        
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        //dog 資料設定
        Cat.type = "波絲貓";
        c1.name = "柯南";
        c1.amount =8;
        c1.price  =12000;
        c1.age    =2;
        
        c2.name="小蘭";
        c2.amount =5;
        c2.price  =5000;
        c2.age    =7;
        
        //Cat 印出
        System.out.printf("品種:%s 名稱:%s 個數:%d 價格:%,6d 年齡:%d 小計:%,7d\n", Cat.type, c1.name, c1.amount, c1.price, c1.age, c1.amount*c1.price);
        System.out.printf("品種:%s 名稱:%s 個數:%d 價格:%,6d 年齡:%d 小計:%,7d\n", Cat.type, c2.name, c2.amount, c2.price, c2.age, c2.amount*c2.price);
        System.out.printf("總資產:%,d", c1.amount*c1.price + c2.amount*c2.price );
    }
}
