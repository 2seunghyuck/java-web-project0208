package com.basic.study;

public class Study0301_1 {
  public static void main(String[] args) {

    System.out.println(solution(3, 7));
    System.out.println(solution(7, 3));
  }
  public static long solution(int a, int b) {
    long answer = 0;
    boolean stop=true;
    int tmpA = a;
    int tmpB = b;
    if(a <= b) {
      while(stop) {
        if(tmpA <= tmpB) {
          answer +=tmpA;
          tmpA++;
        } else if(tmpA > tmpB) stop=false;
      }
    }
    if(a >= b) {
      while(stop) {
        if(tmpB <= tmpA) {
          answer +=tmpB;
          tmpB++;
        } else if(tmpB > tmpA) stop=false;
      }
    }
    return answer;
  }

  //  long answer = 0;
  //  int min,max;
  //   if(a<b)
  //   {
  //      min=a;
  //       max=b;
  //   }
  //  else
  //  {
  //     min=b;
  //      max=a;
  //  }
  //      for(int i=min;i<=max;i++)
  //      {
  //          answer+=i;
  //      }
  //
  //  return answer;


}
