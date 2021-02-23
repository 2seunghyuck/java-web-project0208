package com.basic.day9.Test0223.prob_01;

public class Computer implements Product {
  @Override
  public void turnOff() {
    System.out.println("Turn Off Computer");

  }
  @Override
  public void turnOn() {
    System.out.println("Turn On computer");
  }
}
