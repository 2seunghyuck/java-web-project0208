package com.basic.day4.movie;

import java.util.Scanner;

public class MovieArr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    sc.nextLine();
    Movie[] movie = new Movie[num];

    for(int i=0; i<movie.length; i++) {
      System.out.println("영화제목을 입력하세요");
      String title = sc.nextLine();
      System.out.println("감독을 입력하세요");
      String producer = sc.nextLine();
      movie[i] = new Movie();
      movie[i].setTitle(title);// 이렇게하니깐 널포인트 뜸 생성자로 받으면 괜찮, why? -> 객체를 생성 안했었기 떄문에
      movie[i].setProducer(producer);
    }

    for(int i=0;i<movie.length;i++) {
      System.out.println(movie[i].getTitle());
      System.out.println(movie[i].getProducer());
    }
  }
}
