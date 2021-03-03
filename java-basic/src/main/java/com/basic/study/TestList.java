package com.basic.study;

import java.util.ArrayList;
import java.util.List;

public class TestList {
  public  String solution(String[] participant, String[] completion) {
    List<String> list = new ArrayList<>();
    List<String> list1 = new ArrayList<>();

    for(int i=0; i<participant.length;i++) {
      list.add(participant[i]);
    }
    for(int i=0; i<completion.length;i++) {
      list1.add(completion[i]);
    }
    //    for(String s : list) {
    //      System.out.println(s);
    //    }
    //    System.out.println("----------------------");
    //    for(String s : list1) {
    //      System.out.println(s);
    //    }
    for(int i=0; i<list.size(); i++) {
      if(list1.contains(list.get(i))) {System.out.println("삭제" + list.get(i)); list.remove(i);}
    }
    System.out.println(list.get(1)==list1.get(0) ? true : false);

    System.out.println(list.toString());
    return list.toString();
  }
  public static void main(String[] args) {
    TestList t = new TestList();
    String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] c = {"josipa", "filipa", "marina", "nikola"};
    t.solution(p,c);
  }
}