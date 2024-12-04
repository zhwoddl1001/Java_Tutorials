package com.kh.practice.todolist;

public class BankAccountRun {
 public static void main(String[] args) {           //계좌번호             출금금액
     BankAccount bankAccount = new BankAccount("123-456",1000);
     bankAccount.deposit(10000);
     bankAccount.withdraw(5000);
     bankAccount.withdraw(1500000);
 }
}
