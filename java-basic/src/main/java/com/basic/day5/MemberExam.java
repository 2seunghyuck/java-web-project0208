package com.basic.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Member> members = new ArrayList<Member>();
    int num;
    String name, id;


    while(true) {
      System.out.println("-----------------------------------------");
      System.out.println("1.회원 추가 | 2.회원 삭제 | 3.회원 출력 | 4.종료");
      System.out.print(">> ");
      num = sc.nextInt();
      sc.nextLine();
      s:switch(num) {
        case 1:
          System.out.print("이름 입력 : ");
          name = sc.nextLine();
          System.out.print("ID 입력 : ");
          id = sc.nextLine();
          if(members.size()>0) {
            for(Member m : members) {
              if(m.getId().equals(id)) {
                System.out.println("이미 존재하는 ID입니다.");
                break s;
              }
            }
          }
          members.add(new Member(name,id));
          break;
        case 2:
          System.out.print("삭제할 ID 입력 : ");
          id = sc.nextLine();
          for(Member m : members) {
            if(m.getId().equals(id)) {
              members.remove(m);
              System.out.println("해당 회원이 삭제되었습니다.");
              break s;
            }
          }
          System.out.println("해당 회원은 존재하지 않습니다.");
          break;
        case 3:
          if(members.size()>0) {
            for(Member m : members) {
              System.out.println("이름 :"+m.getName()+" ID :"+m.getId());
            }
          }else {
            System.out.println("회원목록에 회원이 없습니다.");
          }
          break;
        case 4:
          System.out.println("종료됩니다.");
          System.exit(0);
        default:
          System.out.println("다시 입력하세요.");
          break;
      }
    }
  }
}