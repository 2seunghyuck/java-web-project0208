package com.basic.day9.Test0223.prob_03;

import java.util.Scanner;

public class MemberApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MemberHandler mh =new MemberHandler();

    while(true) {
      System.out.println("****Add Members****");
      System.out.println("1.SignIn || 2.SignOut || 3.PrintMembers || 4.Search || 5.Exit");
      int play = sc.nextInt();

      switch(play) {
        case 1 : mh.addMembers(); break;
        case 2 : mh.deleteMembers(); break;
        case 3 : mh.printMembers(); break;
        case 4 : mh.findMembers(); break;
        case 5 : System.exit(-1); break;
      }
    }
  }
}