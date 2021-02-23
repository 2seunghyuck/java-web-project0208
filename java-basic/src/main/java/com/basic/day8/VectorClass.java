package com.basic.day8;

import java.util.Collections;
import java.util.Vector;

public class VectorClass {
  public static void main(String[] args) {
    Vector<String> vc = new Vector<>();
    vc.add("apple");
    vc.add("mango");
    vc.add("banana");

    System.out.println("벡터의 크기 : " +vc.size());
    Collections.sort(vc);
    for(String s : vc) {
      System.out.println(s);
    }
  }
}
