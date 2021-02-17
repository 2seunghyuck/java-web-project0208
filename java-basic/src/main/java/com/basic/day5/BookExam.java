package com.basic.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class BookExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> list = new ArrayList<Book>();
    Book book = new Book();
    boolean run = true;

    while(run) {
      System.out.println("1.입력 || 2. 출력");
      int num = sc.nextInt();
      sc.nextLine();

      switch(num) {

        case 1 : System.out.println("제목을 입력하세요");
        String title = sc.nextLine();
        book.setTitle(title);

        System.out.println("저자를 입력하세요");
        String author = sc.nextLine();
        book.setAuthor(author);
        list.add(new Book()); break;

        case 2 : for(Book b : list) {
          System.out.println(b.getTitle());
          System.out.println(b.getAuthor());
        } break;
        case 3 : run = false;
      }
    }
  }
}