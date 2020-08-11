
package com.pcschool.java0811.ocp.d01;

import java.util.Arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
        double[] h={172,168,164,170,176};
        //Java 7
        double sum = 0;
        double avg = 0;
        for(int i=0, len = h.length;i<len;i++){
            sum += h[i];
        }
        avg = sum/h.length;
        System.out.printf("平均: %.2f\n", avg);
        
        //java 8
        //列出所有h
        Arrays.stream(h).forEach(x -> System.out.println(x));
        //計算總和平均
        sum= Arrays.stream(h).sum();
        avg= Arrays.stream(h).average().getAsDouble();
        System.out.printf("總和:%.2f \n平均:%.2f\n",sum,avg);
    }
 
}
