package com.basic.day5;

public class Rectangle extends Shape{
  int width, height;

  double calcArea() {
    return width*height;
  }

  void draw() {
    System.out.println("("+ x + "." + y + ") 위치에 "+ "가로 : " + width + " 세로 " + height);
  }
  public Rectangle(){
    //  super("from Rectangle");    // 명시적인 호출
    System.out.println("Rectangle default 생성자()");
  }
  public Rectangle(String str){
    //  super("from Rectangle");    // 명시적인 호출
    System.out.println("Rectangle String 생성자()");
  }
}
