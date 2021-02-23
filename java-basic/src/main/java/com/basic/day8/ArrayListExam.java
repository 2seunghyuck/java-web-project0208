package com.basic.day8;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("a");
    list.add("ab");
    list.add("abc");
    list.add("abcd");
    list.add("abcde");
    list.add("abcdef");

    System.out.println("총 객체 수 : " + list.size());
    System.out.println();
    System.out.println("2 : " + list.get(2));
    System.out.println();
    for(int i=0; i<list.size(); i++) {
      System.out.println(i + " : " + list.get(i));
    }
    list.remove(2);
    list.remove(2);
    list.remove("abcdef");
    System.out.println();

    for(int i=0; i<list.size(); i++) {
      System.out.println(i + " : " + list.get(i));
    }


  }
}
