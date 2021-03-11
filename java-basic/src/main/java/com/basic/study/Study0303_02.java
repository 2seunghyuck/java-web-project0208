package com.basic.study;

import java.util.Arrays;
import java.util.Collections;

public class Study0303_02 {
  public String solution(String s) {
    String answer = "";
    Character[] charA=new Character[s.length()];
    for(int i=0;i<s.length();i++) {
      charA[i] = s.charAt(i);
    }
    Arrays.sort(charA,Collections.reverseOrder());
    for(char c : charA) {
      answer += c;
    }
    System.out.println(answer);
    return answer;
  }
  public static void main(String[] args) {
    Study0303_02 t = new Study0303_02();
    String s ="asogicjoZ";
    t.solution(s);
  }
}
//public class ReverseStr {
//  public String reverseStr(String str){
//    char[] ch = str.toCharArray();
//    Arrays.sort(ch);
//    StringBuffer st = new StringBuffer(String.valueOf(ch));
//    st.reverse();
//    return  st.toString();
//  }
//}
