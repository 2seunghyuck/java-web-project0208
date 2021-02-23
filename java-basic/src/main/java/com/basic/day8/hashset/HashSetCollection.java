package com.basic.day8.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetCollection {

  Scanner sc = new Scanner(System.in);
  Set<Member> set = new HashSet<>();

  public void add() {
    System.out.println("추가할 아이디를 입력하세요");
    int memberId = sc.nextInt(); sc.nextLine();
    System.out.println("추가할 이름을 입력하세요");
    String memberName = sc.nextLine();
    set.add(new Member(memberId, memberName));
  }

  public void delete() {
    System.out.println("삭제할 아이디를 입력하세요");
    int memberId = sc.nextInt(); sc.nextLine();
    Iterator<Member> ite = set.iterator();
    while(ite.hasNext()) {
      Member m = ite.next();
      if(m.getMemberId() == memberId) {
        set.remove(m);
        return;
      }
    }
    System.out.println("해당아이디가 존재하지 않습니다.");
  }
  public void print() {
    for(Member s : set) {
      System.out.println(s);
    }
  }

}
