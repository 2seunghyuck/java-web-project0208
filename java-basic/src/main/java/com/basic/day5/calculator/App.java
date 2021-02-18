package com.basic.day5.calculator;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Plus p = new Plus();
    Minus m = new Minus();
    Multiple mul = new Multiple();
    Divide d = new Divide();

    while(true) {
      System.out.println("계산할 숫자를 입력하세요");
      int a = sc.nextInt();
      sc.nextLine();
      System.out.println("연산자를 입력하세요");
      String op = sc.nextLine();
      System.out.println("계산할 숫자를 입력하세요");
      int b = sc.nextInt();
      sc.nextLine();
      switch(op) {
        case "+" : p.setValue(a, b); p.calculator(); break;
        case "-" : m.setValue(a, b); m.calculator(); break;
        case "*" : mul.setValue(a, b); mul.calculator(); break;
        case "/" : d.setValue(a, b); d.calculator(); break;
      }
    }
  }
}
