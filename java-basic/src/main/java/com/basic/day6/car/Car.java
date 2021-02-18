package com.basic.day6.car;

public class Car {
  Tire[] tires = {new HankookTire(),new HankookTire(),new HankookTire(),new HankookTire()};
  void run() {
    for (Tire tire : tires) {
      tire.roll();
    }
  }
}
