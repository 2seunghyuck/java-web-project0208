package com.basic.study;

import java.util.Arrays;

public class Study0305_01{
  public String[] solution(String[] strings, int n) {
    String[] answer = new String[strings.length];
    Arrays.sort(strings);
    for(int i=0; i<strings.length; i++) {
      answer[i] = strings[i];
      for(int j=i+1; j<strings.length; j++) {
        if(strings[i].charAt(n) > strings[j].charAt(n)) {
          answer[i] = strings[j];
          strings[j] = strings[i];
          strings[i] = answer[i];
        } else { answer[i] = strings[i];}
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    Study0305_01 t = new Study0305_01();
    String[] strings = {"sun", "bed", "car","sunn","sum"};
    System.out.println(t.solution(strings,1));
    System.out.println(t.solution(strings,2));
  }
}

