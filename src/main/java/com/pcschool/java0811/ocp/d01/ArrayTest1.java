package com.pcschool.java0811.ocp.d01;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] scores = {100, 90, 83, 70};
        int sum=0;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        System.out.println(scores.length);//印出scores的長度
        for(int i=0;i<scores.length;i++){
            sum+=scores[i];
        }
        double sum2=0;
        double avg = (double)sum/scores.length;
        for(int i=0;i<scores.length;i++){
            sum2 += Math.pow(scores[i]-avg, 2);
        }
        double sd = Math.sqrt(sum2/scores.length);
        System.out.printf("標準差: %f\n",sd);
        double cv = sd/avg;
        System.out.printf("變異係數: %f\n",cv);
    }
    
}
