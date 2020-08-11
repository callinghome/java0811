
package com.pcschool.java0811.ocp.d01;

public class BMI {
    public String name;
    public double h;
    public double w;
    public double bmi;
    
    public double calcBMI(){
        bmi = w / Math.pow(h/100, 2);
        return bmi;
    }
}
