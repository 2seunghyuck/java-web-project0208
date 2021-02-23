package com.basic.day9.Test0223.prob_02;

import java.util.HashSet;
import java.util.Scanner;

public class PrintNameTest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    HashSet<Member> hs = new HashSet<>();
    int count=0;

    while(count<5) {
      System.out.print("Input Name ! : ");
      String name = sc.nextLine();
      hs.add(new Member(name));
      count++;
    }
    for(Member member : hs) {
      System.out.print(member + ",");
    }
  }
}
