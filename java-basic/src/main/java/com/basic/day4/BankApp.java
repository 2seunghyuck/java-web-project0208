package com.basic.day4;

import java.util.Scanner;


public class BankApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount ba = new BankAccount();

    while(true) {
      System.out.println("1.입금 | 2. 출금 | 3. 종료");
      int btn = sc.nextInt();
      switch(btn) {
        case 1 : System.out.println("입금액을 입력하세요 : ");
        int input = sc.nextInt();
        ba.deposit(input); break;

        case 2 : System.out.println("출금액을 입력하세요 : ");
        int output = sc.nextInt();
        ba.withdraw(output); break;
        case 3 : System.exit(0);
      }
      ba.print();
    }
  }

}
