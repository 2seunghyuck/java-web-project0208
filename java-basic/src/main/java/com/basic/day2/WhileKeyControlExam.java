package com.basic.day2;

import java.util.Scanner;

public class WhileKeyControlExam {
  public static void main(String[] args) throws Exception {

    boolean run = true;
    int speed = 0;
    int keyCode = 0;

    Scanner sc = new Scanner(System.in);
    String name = null;
    String addr = null;
    while(run) {
      if(keyCode !=13 && keyCode!=10) { // Enter키는 13, 10 을 입력하게 되므로 제외시킨다.
        System.out.println("-----------------------------");
        System.out.println("1.이름 | 2.주소 | 3.정보 | 4.중지 ");
        System.out.println("-----------------------------");
        System.out.println("선택");
      }

      keyCode = System.in.read();

      if (keyCode == 49) {
        System.out.println(String.valueOf(sc.nextLine()));
        System.out.println("이름을 입력하세요");
        name = sc.nextLine();
        System.out.println("이름 = " + name);
      } else if (keyCode == 50) {
        sc.nextLine();
        System.out.println("주소를 입력하세요");
        addr = sc.nextLine();
        System.out.println("주소 = " + addr);
      } else if (keyCode ==51) {
        System.out.println("이름 :" + name + "\t주소 : " + addr);
      } else if (keyCode ==52) {
        run = false;
      }
    }
    System.out.println("프로그램 종료");
  }
}
