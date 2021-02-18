package com.basic.day6.test;

public class Triangle extends Shape{
  private int x;
  private int y;
  public int getX() {
    return x;
  }
  public void setX(int x) {
    this.x = x;
  }
  public int getY() {
    return y;
  }
  public void setY(int y) {
    this.y = y;
  }
  @Override
  public void draw() {
    System.out.println("삼각형 그리기");
  }
  @Override
  public void move(int x, int y) {
    System.out.println("삼각형 이동 좌표");
    this.x = x; this.y = y;
    System.out.println("X : " + x + "\tY: " + y);
  }
}
