package com.basic.day4;

public class BankAccount {
  int accountNumber;
  String name;
  int balance;

  void deposit(int input) {  // 입금
    this.balance += input;
  }
  void withdraw(int output) { // 출금
    if(output < balance) {
      this.balance -= output;
    } else {
      System.out.println("출금가능한 잔액이 부족합니다.");
    } return;
  }
  void print () { // 잔액 조회
    System.out.println("현재 잔액은 "+balance+"원 입니다.");
  }
}
