package com.basic.study;

public class Test {

  public  String solution(String[] participant, String[] completion) {

    int index=0;
    int tmp=0;
    for(int i=0; i<participant.length; i++) {
      tmp += i;
    }
    for(int i=0; i<participant.length; i++) {
      for(int j=0; j<completion.length; j++) {
        if(participant[i].equals(completion[j]))  index += i;
      }
    }
    for(int i=0; i<participant.length; i++) {
      for(int j=i+1; j<participant.length;j++) {
        if(participant[i].equals(participant[j])) tmp+=i;
      }
    }
    return participant[tmp-index];
  }
}
