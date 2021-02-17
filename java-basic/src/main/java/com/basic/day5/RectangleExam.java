package com.basic.day5;

public class RectangleExam {
  public static void main(String[] args) {
    // 생성자 호출 순서 1부모 -> 2자식
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle("test");

  }

}
