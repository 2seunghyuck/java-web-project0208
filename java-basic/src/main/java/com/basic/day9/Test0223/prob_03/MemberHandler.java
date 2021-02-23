package com.basic.day9.Test0223.prob_03;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MemberHandler {
  Scanner sc = new Scanner(System.in);
  Set<Member> ts = new TreeSet<>();

  public void addMembers() {
    System.out.println("Input Id : ");
    String id = sc.nextLine();
    System.out.println("Input name : ");
    String name = sc.nextLine();

    ts.add(new Member(id, name));

  }

  public void deleteMembers() {
    System.out.println("Input Delete Id");
    String id = sc.nextLine();

    Iterator<Member> ite = ts.iterator();
    while(ite.hasNext()) {
      Member delId = ite.next();
      if(delId.getId().equals(id)) {
        ts.remove(delId);
        System.out.println("Complete Delete Id !");
        return;
      }
    }
  }
  public void printMembers() {
    for(Member m : ts) {
      System.out.println(m);
    }
  }
  public void findMembers() {
    System.out.println("Input Find Id");
    String id = sc.nextLine();
    Iterator<Member> ite = ts.iterator();
    while(ite.hasNext()) {
      Member delId = ite.next();
      if(delId.getId().equals(id)) {
        System.out.println("Name : " + delId.getName() + "\t Id : " + delId.getId());
      }
    }
  }
}
