
package com.pcschool.java0811.ocp.d01;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

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
        //取最大
        double max=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            if(h[i]>max){
                max = h[i];
            }
        }
        System.out.println("最大值:"+max);
        double min=Integer.MAX_VALUE;
        for(int i=0;i<5;i++){
            if(h[i]<min){
                min = h[i];
            }
        }
        System.out.println("最小值:"+min);
        
        //java 8
        //列出所有h
        Arrays.stream(h).forEach(x -> System.out.println(x));
        //計算總和平均
        sum= Arrays.stream(h).sum();
        avg= Arrays.stream(h).average().getAsDouble();
        System.out.printf("總和:%.2f \n平均:%.2f\n",sum,avg);
        max = Arrays.stream(h).max().getAsDouble();
        System.out.printf("最大:%.2f\n",max);
        min = Arrays.stream(h).min().getAsDouble();
        System.out.printf("最小:%.2f\n",min);
        DoubleSummaryStatistics stat =Arrays.stream(h).summaryStatistics();
        System.out.println(stat);
        System.out.printf("最大值:%.2f\n",stat.getMax());
        System.out.printf("最小值:%.2f\n",stat.getMin());
    }
 
}
