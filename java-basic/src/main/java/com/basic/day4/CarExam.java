package com.basic.day4;

public class CarExam {
  public static void main(String[] args) {
    Car myCar = new Car();

    myCar.setSpeed(-50);
    System.out.println("현재속도 " + myCar.getSpeed());

    myCar.setSpeed(80);
    if(!myCar.isStop()) {
      myCar.setStop(true);
    }
    System.out.println("현재속도 " + myCar.getSpeed());
  }

}
