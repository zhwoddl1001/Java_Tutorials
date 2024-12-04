package com.kh.practice.todolist;

public class BankAccountRun {
    private System accountNumber;
    private double balance;

    public BankAccountRun(System accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /*
    * 
    * deposit 입금 기능
    * @param amount 입금할 금액
    * 
    * */ 
    public void deposit(double amount) {
        if (amount> 0){ // 입금할 금액이 0원보다 클 경우에만 입금 가능
            balance += amount; // 현재 잔액에 입금 금액 더하기
            System.out.println( amount + "원이 입금되었습니다 현재 잔액 : " + accountNumber+ "원");
        }else {
            System.out.println("올바른 금액을 입금해주세요.");
        }
    }
}
