package com.basic.day2;

public class DiceExam {
  public static void main(String[] args) {

    int dice1 = (int) (Math.random() * 100) + 1;
    int dice2 = (int) (Math.random() * 100) + 1;

    System.out.println("dice 1 :" + dice1);
    System.out.println("dice 2 :" + dice2);

    if (dice1 < dice2) {
      System.out.println("1번이 이김");
    } else if (dice1 == dice2) {
      System.out.println("비김");
    } else {
      System.out.println("2번이 이김");
    }
  }
}
