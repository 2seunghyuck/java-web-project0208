package com.basic.day2;

public class CoinTossTest {
  public static void main(String[] args) {
    int coin1;
    int coin2;
    int coin3;
    int cnt=0;

    while(true) {
      coin1 = (int)(Math.random() *2);
      coin2 = (int)(Math.random() *2);
      coin3 = (int)(Math.random() *2);
      cnt++;
      if (coin1 ==0 && coin2 ==0 && coin3 ==0) break;
    }

    System.out.println("coin1 : " + coin1);
    System.out.println("coin2 : " + coin2);
    System.out.println("coin3 : " + coin3);
    System.out.println("모두 앞면이 나오는데 걸린횟수 : " +cnt);
  }
}
