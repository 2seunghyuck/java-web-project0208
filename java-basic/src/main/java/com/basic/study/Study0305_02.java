package com.basic.study;

public class Study0305_02{
  public boolean solution(String s) {
    boolean answer = true;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i) <= 'z' && s.charAt(i) >= 'a') answer=false;
      if(s.length()!=4 || s.length()!=6) answer=false;
    }
    return answer;
  }
  public static void main(String[] args) {
    Study0305_02 t = new Study0305_02();
    String s ="a234";
    String s2 = "1234";
    t.solution(s);
    t.solution(s2);
    System.out.println(t.solution(s));
    System.out.println(t.solution(s2));
  }
}