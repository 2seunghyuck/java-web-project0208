package com.basic.day7;

public class Exam {
  int a=10;

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }
}

/* 람다식
 * -->익명의 함수만들기 객체를 하나만 생성하고 싶을때
 *      (int a, int b) ->{return a+b;}
 *
 * 제네릭 <>
 *  컴파일시 타입체크하기 편함.
 *
 */

