package com.basic.study;

public class Study0302_2 {
  boolean solution(String s) {
    int countP=0;
    int countY=0;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i)=='y') countY++;
      if(s.charAt(i)=='Y') countY++;
      if(s.charAt(i)=='p') countP++;
      if(s.charAt(i)=='P') countP++;
    }
    return (countP == countY) ? true : false;
  }
  public static void main(String[] args) {
    Study0302_2 t = new Study0302_2();
    System.out.println(t.solution("poePoeopYpeyy"));
  }
}
