package com.basic.day8;

import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    TreeSet<String> treeSet = new TreeSet<>();
    String name;

    for(int i =0; i<5; i++) {
      System.out.println("추가할 이름은 ?");
      name = sc.nextLine();
      treeSet.add(new String(name));
    }
    System.out.println(treeSet);

  }
}
