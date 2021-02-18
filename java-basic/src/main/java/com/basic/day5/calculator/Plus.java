package com.basic.day5.calculator;

public class Plus extends Calc{

  int a;
  int b;

  @Override
  public void setValue(int a, int b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public int calculator() {
    System.out.println(a+b);
    return a + b;
  }

}
