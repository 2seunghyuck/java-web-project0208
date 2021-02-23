package com.basic.day9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapNationExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Map<String,Integer> map = new HashMap<>();
    int count=0;

    while(count<3) {
      System.out.println("나라이름을 입력하세요");
      String nation = sc.nextLine();
      System.out.println("인구수를 입력하세요");
      int people = sc.nextInt();
      sc.nextLine();
      map.put(nation, people);
      count++;
    }

    int tmp = 0;
    Set<String> keySet = map.keySet();
    Iterator<String> ite = keySet.iterator();
    while(ite.hasNext()) {
      String key = ite.next();
      int value = map.get(key);
      if (tmp < map.get(key)) {
        tmp = value;
      }
      System.out.println("나라이름 ?"+ key + "인구수 ?" + value);
      System.out.println("------------------------------------");
    }
    System.out.println("인구수가 가장 많은 나라는 ?" + tmp);


  }
}