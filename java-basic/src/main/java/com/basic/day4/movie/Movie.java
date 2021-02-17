package com.basic.day4.movie;

public class Movie {
  private String title =null;
  private String producer=null;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getProducer() {
    return producer;
  }


  public void setProducer(String producer) {
    this.producer = producer;
  }


  public void print() {
    System.out.println("제목 : " + title);
    System.out.println("감독 : " + producer);
  }
}
