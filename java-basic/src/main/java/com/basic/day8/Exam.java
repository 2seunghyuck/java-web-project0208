package com.basic.day8;

import java.util.ArrayList;

public class Exam {
  public static void main(String[] args) {
    ArrayList list1 = new ArrayList();
    list1.add(10);
    list1.add(9);
    list1.add(8);
    list1.add(7);
    list1.add(6);
    list1.add(5);
    ArrayList list2 = new ArrayList(list1.subList(0, 5)); // 인덱스 0부터 5까지를 list2에 대입한다.
    // print(list1,list2);
    System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); // list1과 list2의
    // 교집합을 출력한다.
    list2.add("a");
    list2.add("b");
    list2.add(3, "A");
    print(list1, list2);
    list2.set(3, "B");
    print(list1, list2);
    for (int i = list2.size() - 1; i >= 0; i--) {
      if (list1.contains(list2.get(i)))
        list2.remove(i);
    }
    print(list1, list2);
  }

  static void print(ArrayList list1, ArrayList list2) {
    System.out.println("list1 : " + list1);
    System.out.println("list2 : " + list2);
    System.out.println();
  }
}
