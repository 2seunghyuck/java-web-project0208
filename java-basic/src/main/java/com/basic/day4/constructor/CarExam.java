package com.basic.day4.constructor;

public class CarExam {
  public static void main(String[] args) {
    Car myCar1 = new Car("검정", 3000);
    Car myCar2 = new Car();

    System.out.println("차의 색 : " + myCar1.color);
    System.out.println("차의 cc : " + myCar1.cc);

    System.out.println("차의 색 : " + myCar2.color);
    System.out.println("차의 cc : " + myCar2.cc);
  }
}
