package com.basic.study;

public class Test2{
  public int solution(int n) {
    int[] arr = new int[n + 1];
    int c = 0;
    for (int i = 2; i <= n; i++) {
      arr[i] = i;
    }

    int Sqrt = (int) Math.sqrt(n);
    for (int i = 2; i <= Sqrt; i++) {
      if (arr[i] == 0) {
        continue;
      }
      for (int j = i + i; j <= n; j += i) {
        arr[j] = 0;
      }
    }
    for (int i = 2; i <= n; i++) {
      if (arr[i] != 0) {
        c++;
      }
    }
    return c;
  }
  public static void main(String[] args) {
    Test2 t = new Test2();
    System.out.println(t.solution(10));
  }
}