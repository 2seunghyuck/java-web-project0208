package com.basic.day5;

public class Shape {
  protected int x,y;
  void print() {
    System.out.println("x좌표 : " +x + "y좌표 : " +y);
  }
  public Shape() {
    System.out.println("default Shape 생성자()" );
  }
  public Shape(String msg) {
    System.out.println("Shape String 생성자() " + msg);
  }
}
