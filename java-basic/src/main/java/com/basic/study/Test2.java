package com.basic.study;

public class Test2{
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String binaryString = null;
    String[] answer = new String[n];
    for(int i=0; i<arr1.length;i++) {
      StringBuffer sb = new StringBuffer();

      String binaryString1 = Integer.toBinaryString(arr1[i]);
      String binaryString2 = Integer.toBinaryString(arr2[i]);

      while(binaryString1.length() != n) binaryString1 = "0" + binaryString1;
      while(binaryString2.length() != n) binaryString2 = "0" + binaryString2;

      for(int j=0; j<n; j++) {
        int tmp = (Character.getNumericValue(binaryString1.charAt(j)) + Character.getNumericValue(binaryString2.charAt(j)));
        String s = Integer.toString(tmp);
        if(!s.equals("0")) sb.append("#");
        else sb.append(" ");
      }
      answer[i] = sb.toString();
    }
    return answer;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};

    System.out.println(t.solution(n, arr1, arr2));
  }
}