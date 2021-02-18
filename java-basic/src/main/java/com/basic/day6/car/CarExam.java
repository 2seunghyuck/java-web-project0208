package com.basic.day6.car;

public class CarExam {
  public static void main(String[] args) {
    Car car = new Car();
    car.run();

    car.tires[0] = new KumhoTire();
    car.tires[1] = new KumhoTire();
    car.run();
  }
}
