package com.basic.day9.Test0223.prob_01;

import java.util.Scanner;

public class SalesHandler {
  Scanner sc1 = new Scanner(System.in);
  final int TV_PRICE = 100;
  final int COMPUTER_PRICE = 200;

  int money;
  boolean count = true;
  int prodTv = 0;
  int prodCom = 0;

  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }

  void buyProduct() {

    System.out.println("1.Buy 'TV' 2.Buy 'COMPUTER' ");
    int buy = sc1.nextInt();

    System.out.println("How many Products you buy?");
    int amount = sc1.nextInt();

    if (buy == 1) {
      if(money > TV_PRICE) {
        money -= (TV_PRICE*amount);
        prodTv += amount;
      }
    } else if (buy == 2) {
      if(money > COMPUTER_PRICE) {
        money -= (COMPUTER_PRICE*amount);
        prodCom += amount;
      }
    } else {
      System.out.println("Not enough balnce.");
    }
    System.out.println("Complete ");
  }

  void checkMoney() {
    System.out.printf(" Balance : %d, \tPurchased TV: '%d'  \tPurchased Computer: '%d'  \n", money, prodTv, prodCom);
  }
}
