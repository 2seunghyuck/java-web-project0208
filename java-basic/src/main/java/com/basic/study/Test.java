package com.basic.study;

public class Test{
  public int[] solution(int[] arr) {
    int[] answer = new int[arr.length-1];
    if(arr.length==1) return new int[]{-1};
    int tmp = 0;
    for(int i = 0; i < arr.length ; i++)
      if(arr[i]<arr[tmp])
        tmp = i;
    int count = 0;
    for(int i = 0; i < arr.length ; i++) {
      if(i==tmp) continue;
      answer[count++] = arr[i];
    }
    return answer;
  }
  public static void main(String[] args) {
    Test t = new Test();
    int[] arr = {4,3,2,1};
    System.out.println(t.solution(arr));
  }
}