package com.basic.day8;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
  public static void main(String[] args) {
    List<String> list = new LinkedList<>();

    list.add("abc");
    list.add("asd");
    list.add("qwe");
    list.add("zxc");
    list.add("fgh");
    list.set(1, "poi");

    String s = list.get(1);
    System.out.println(s);

    for(int i=0; i<list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}
