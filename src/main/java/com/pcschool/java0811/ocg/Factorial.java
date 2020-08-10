
package com.pcschool.java0811.ocg;

import java.util.Scanner;

public class Factorial {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.printf("Key in a number, this program will show it factorail\n");
        int num = sc.nextInt();
        int result = factorial(num);
        System.out.printf("%d! = %d\n", num, result);
        
    }
    
    public static int factorial(int a){
        if(a==1){
            return 1;
        }else{
            return a*factorial(a-1);
        }
        
    }
}
