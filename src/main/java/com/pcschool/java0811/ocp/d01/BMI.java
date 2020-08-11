
package com.pcschool.java0811.ocp.d01;

public class BMI {
    public String name;
    public double h;
    public double w;
    private double bmi;//私有物件變數
    //取得BMI值
    public double getBMI(){
        return bmi;
    }
    //設定BMI值
    public void setBMI(){
        bmi = w / Math.pow(h/100, 2);
    }
}
