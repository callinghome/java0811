
package com.pcschool.java0811.ocp.d01;


public class BMIStore {
    public static void main(String[] args) {
        BMI b1 = new BMI();
        b1.name ="John";
        b1.h=170;
        b1.w=60;
        b1.bmi= b1.calcBMI();
        
        BMI b2 = new BMI();
        b2.name ="Mary";
        b2.h=165;
        b2.w=45;
        b2.bmi= b2.calcBMI();
        
        System.out.printf("%s bmi=%.2f\n", b1.name, b1.bmi);
        System.out.printf("%s bmi=%.2f\n", b2.name, b2.bmi);
    }
 
}
