package com.basic.day9;

class CounterTest {
  private int value =0;
  public void increment() {value++;}
  public void decrement() {value--;}
  public void printCounter() {System.out.println(value);}
}

class MyThread extends Thread {
  CounterTest sharedCounter;

  public MyThread(CounterTest c) {
    this.sharedCounter = c;
  }
  @Override
  public void run () {
    int i=0;
    while(i<2000) {
      sharedCounter.increment();
      sharedCounter.decrement();
      if (i%40 == 0) {
        sharedCounter.printCounter();
      }
      try {
        sleep((int)(Math.random() *2 ));
      } catch (Exception e) {}
      i++;
    }
  }
}
public class Counter {
  public static void main(String[] args) {
    CounterTest c = new CounterTest();
    new MyThread(c).start();;
    new MyThread(c).start();;
    new MyThread(c).start();;
    new MyThread(c).start();;
  }
}