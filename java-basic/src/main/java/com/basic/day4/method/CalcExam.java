package com.basic.day4.method;

public class CalcExam {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    calc.powerON();

    int result = calc.plus(5, 6);
    System.out.println("result : " + result);

    byte x =10;
    byte y =4;
    double result1 = calc.divide(x, y);
    System.out.println("result2 : " + result1);

    calc.powerOff();
  }
}
