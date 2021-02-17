package com.basic.day4.constructor;

public class Car {
  String color;
  int cc;

  // 생성자
  // - 클래스 이름과 같아야함
  // - 초기화 시키기 위해 사용
  Car(){};

  Car(String col, int c){
    color = col;
    cc = c;
  };
}
