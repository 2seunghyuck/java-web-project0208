package com.basic.day9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFindMapExam {
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    map.put("java", "자바");
    map.put("school", "학교");
    map.put("map", "지도");
    String find;
    boolean run = true;

    while(run) {
      System.out.print("찾고싶은 단어를 입력하세요 ->");
      find = sc.nextLine();
      if(find.equalsIgnoreCase("exit")) {run=false;}
      System.out.println("단어의 의미는 '"+map.get(find)+"'");
    }
  }
}
