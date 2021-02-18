package com.basic.day6.test;

public class Shape implements Movable{

  @Override
  public void move(int x, int y) {
    System.out.println("X : " + x + "\tY: " + y);
  }
  public void draw() {
    System.out.println("그리기");
  }
}
