package com.basic.study;

public class Study0301_2 {
  public static String solution(String s) {
    String answer = "";
    if(s.length()%2==0) {
      answer = Character.toString(s.charAt(s.length()/2 -1)) + Character.toString(s.charAt(s.length()/2));
    }
    else if(s.length()%2==1) {answer = Character.toString(s.charAt(s.length()/2));}
    System.out.println(answer);
    return answer;
  }

  public static void main(String[] args) {
    solution("calendar");
  }
  //  public String solution(String s) {
  //    String answer = "";
  //
  //     int index= s.length();
  //    if(index%2==0)
  //    { index/=2;
  //      answer =s.substring(index-1,index+1);
  //    }else
  //    {
  //        index/=2;
  //       answer= s.substring (index,index+1);
  //
  //    }
  //
  //    return answer;

}