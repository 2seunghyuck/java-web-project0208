package com.basic.day5;

import java.util.Scanner;

public class MemberServiceExam {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    MemberService ms = new MemberService();
    ms.setId("a");
    ms.setPassword("1");

    boolean result = ms.login("a", "1");
    ms.logout("a");
  }
}
