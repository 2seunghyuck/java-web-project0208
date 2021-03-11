package com.basic.study;

public class Study0304_02 {
  public String solution(String[] seoul) {
    int index=0;
    for(int i=0; i<seoul.length; i++) {
      if(seoul[i].equals("Kim")) index=i;
    }
    return "김서방은 "+index+"에 있다.";
  }
  public static void main(String[] args) {
    String[] seoul= {"jane","Kim"};
    Study0304_02 t= new Study0304_02();
    System.out.println(t.solution(seoul));

  }
}
