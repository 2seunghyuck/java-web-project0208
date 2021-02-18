package com.basic.day6.test;

public class MoveExam {
  public static void main(String[] args) {

    int x =(int) (Math.random() * 100 ) + 1;
    int y =(int) (Math.random() * 100 ) + 1;
    Movable[] arr = new Shape[3];
    arr[0] = new Rectangle();
    arr[1] = new Triangle();
    arr[2] = new Circle();

    for (int i = 0; i< arr.length; i++) {
      System.out.println(arr[i]);
      arr[i].move(x, y);
      (Shape(arr[i]).draw());
    }
  }
}
