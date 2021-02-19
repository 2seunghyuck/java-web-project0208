package com.basic.day7.generic;

import com.basic.day7.Exam;

public class BoxingMethodExample {
  public static void main(String[] args) {

    Box<Exam> box3 = Util.<Exam>boxing(new Exam());
    Exam e = box3.get();
    System.out.println(e.getA());

    System.out.println();
    Box<Integer> box1 = Util.<Integer>boxing(100);
    int value = box1.get();
    System.out.println(value);

    Box<String> box2 = Util.boxing("홍길동");
    String strValue = box2.get();
    System.out.println(strValue);

  }
}
