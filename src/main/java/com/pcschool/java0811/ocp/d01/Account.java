
package com.pcschool.java0811.ocp.d01;

public class Account {
    private int balance;//為了不讓main直接修改balance，而架空其他方法，所以設為private
    //存款
    public void save(int money){
        if(money>0){
            balance += money;
        }
    }
    //提款
    public void withdraw(int money){
        if(money>0 && balance >= money){ //除了money要大於零，balance還要夠提
            balance -= money;
        }
    }
    //取得帳戶餘額
    public int getBalance(){
        return balance;
    }
}
