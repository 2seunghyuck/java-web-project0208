package com.basic.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
  public static void main(String[] args) {

    Set<String> set = new HashSet<>();
    set.add("a");
    set.add("ab");
    set.add("abwe");
    set.add("abc");
    set.add("abcd");
    set.add("abcd");
    set.add("abcde");
    set.add("abcdef");

    Iterator<String> ite = set.iterator();
    while(ite.hasNext()) {
      System.out.println(ite.next());
    }
    System.out.println("총 객체수 : " +set.size());
    System.out.println();
    set.remove("abwe");
    set.remove("abcd");
    while(ite.hasNext()) {
      System.out.println(ite.next());
    }
    //    for(String s : set) {
    //      System.out.println(s);
    //    }
    System.out.println("총 객체수 : " +set.size());
    System.out.println();
    set.clear();
    System.out.println("총 객체수 : " +set.size());
  }
}
