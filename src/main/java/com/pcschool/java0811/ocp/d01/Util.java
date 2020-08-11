package com.pcschool.java0811.ocp.d01;
public class Util {
    public double[] values;
    public double getSum(){
        double sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }
    public double getAvg(){
        return getSum()/values.length;
    
    }
    public double getSD(){
        double sum=0;
        for(int i=0;i<values.length;i++){
            sum += Math.pow(values[i]-getAvg(), 2);
        }
        double sd = Math.sqrt(sum/values.length);
        return sd;
    }
    public double getCV(){
        double cv = getSD()/getAvg();
        return cv;
    
    }
    
}
