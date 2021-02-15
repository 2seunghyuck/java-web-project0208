package com.basic.day3;

public class MainStringExma {
  public static void main(String[] args) {

    if(args.length != 2 ) {
      System.out.println("프로그램 사용법");
      System.out.println("java -cp bin/main com.basic.day3.MainStringExma num1 num2");
      System.exit(0);
    }

    String name = args[0];
    String strNum2 = args[1];

    int num2 = Integer.parseInt(strNum2);

    System.out.println("이름: " + name + "전화: "+ num2);
  }
}

