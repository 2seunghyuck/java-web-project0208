package com.basic.study;

import java.util.Arrays;

public class Answer0302_1 {

  public String solution(String[] participant, String[] completion) {
    Arrays.sort(participant);
    Arrays.sort(completion);

    System.out.println("-----------------");
    int i;
    for(i=0; i<completion.length; i++) {
      if(!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }
    return participant[i];
  }
  public static void main(String[] args) {
    Answer0302_1 t = new Answer0302_1();
    String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] c = {"josipa", "filipa", "marina", "nikola"};
    System.out.println(t.solution(p,c));
  }
}
