package com.basic.day9.Test0223.prob_01;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    SalesHandler sh = new SalesHandler();

    Scanner sc = new Scanner(System.in);
    System.out.println("Input Balance ");
    int money = sc.nextInt();
    sh.setMoney(money);

    while(true) {
      System.out.println("1.Buy Product || 2.Check Balance || 3.Exit");
      int choice = sc.nextInt();
      switch(choice) {
        case 1 : sh.buyProduct(); break;
        case 2 : sh.checkMoney(); break;
        case 3 : System.exit(-1); break;
      }
    }
  }
}