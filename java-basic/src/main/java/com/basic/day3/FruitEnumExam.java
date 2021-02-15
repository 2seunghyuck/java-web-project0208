package com.basic.day3;

public class FruitEnumExam {

  public static void main(String[] args) {

    Fruit fav = null;

    int random = (int)(Math.random() *5) +1;

    switch(random) {
      case 1 : fav = Fruit.APPLE; break;
      case 2 : fav = Fruit.BANANA; break;
      case 3 : fav = Fruit.CHERRY; break;
      case 4 : fav = Fruit.GRAPE; break;
      case 5 : fav = Fruit.ORANGE; break;
    }
    System.out.println(fav);
  }
}
