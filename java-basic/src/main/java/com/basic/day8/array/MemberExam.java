package com.basic.day8.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberExam {
  static Scanner sc = new Scanner(System.in);
  static List<Member> list = new ArrayList<>();

  public static void main(String[] args) {
    Member member = new Member();

    while(true) {
      System.out.println("** 회원 관리 프로그램 **");
      System.out.println("1.회원 추가 || 2.회원 삭제 || 3.전체회원 출력 || 4.종료 ");
      int choice = sc.nextInt();
      sc.nextLine();
      switch(choice) {
        case 1 : System.out.println("아이디를 입력하세요");
        int memberId = sc.nextInt(); sc.nextLine();
        System.out.println("이름을 입력하세요.");
        String memberName = sc.nextLine();
        list.add(Add(memberId, memberName)); break;
        case 2 : Delete(list); break;
        case 3 : Print(member); break;
        case 4 : System.exit(0);break;
      }
    }
  }

  static Member Add(int memberId, String memberName) {
    Member member = new Member();
    for(Member m : list) {
      if(m.getMemberId() == memberId) {
        System.out.println("같은 아이디가 존재합니다");
        return null;
      }
    }
    member.setMemberId(memberId);
    member.setMemberName(memberName);
    return member;
  }

  static void Delete(List<Member> list) {
    System.out.println("아이디를 입력하세요");
    int removeId = sc.nextInt(); sc.nextLine();
    for(int i=0; i< list.size(); i++) {
      if (list.get(i).getMemberId() == removeId) {
        list.remove(list.remove(i));
      }
    }
  }
  static void Print(Member member) {
    for(Member m : list) {
      System.out.println(m);
    }
  }
}
