package com.basic.day5;

public class MemberService {
  private String id;
  private String password;

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public boolean login(String id, String password) {
    if (this.id == id && this.password == password) {System.out.println("로그인이 완료되었습니다."); return false;}
    else {System.out.println("로그인에 실패하였습니다."); return true;}
  }
  public void logout(String id) {
    System.out.println(id + "님 로그아웃 되었습니다.");
  }
}
