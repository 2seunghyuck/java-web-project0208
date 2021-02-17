package com.basic.day4.method;

public class Calculator {

  static double pi = 3.14159;

  void powerON() {
    System.out.println("전원을 켭니다.");
  }
  int plus (int x,int y) {
    int result = x + y;
    return result;
  }
  double divide(int x, int y) {
    double result = (double)x / (double)y;
    return result;
  }
  void powerOff() {
    System.out.println("전원을 끕니다.");
  }
}
