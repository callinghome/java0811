package com.pcschool.java0811.ocp.d01;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        run(account);
        
    }
    public static void run(Account account){
        System.out.println("run......");
        System.out.println("1.存款");
        System.out.println("2.提款");
        System.out.println("3.查詢");
        System.out.println("9.離開");
        System.out.println("-----------");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("請輸入存款金額");
                int saveMoney = sc.nextInt();
                account.save(saveMoney);
                break;
            case 2:
                System.out.println("請輸入存款金額");
                int withdrawMoney = sc.nextInt();
                account.withdraw(withdrawMoney);
                break;
            case 3:
                int balance = account.getBalance();
                System.out.printf("帳戶餘額:%,d\n", balance);
                break;
            case 9:
                return;
        }
        System.out.println("Please press Enter to continue...");
        new Scanner(System.in).nextLine();
        run(account);
        
        
    }
}
