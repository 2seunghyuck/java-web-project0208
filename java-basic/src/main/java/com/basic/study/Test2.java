package com.basic.study;

public class Test2{
  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    for(int i=0; i<prices.length; i++) {
      for(int j =i+1;j<prices.length;j++) {
        if(prices[i] <= prices[j]) answer[i]++;
        else {answer[i]++; break;}
      }
    }
    answer[prices.length-1] = 0;
    return answer;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    //    int[] prices = {1, 2, 3, 2 ,3};
    int[] prices = {1, 2, 3, 2, 3, 1};

    t.solution(prices);

  }
}