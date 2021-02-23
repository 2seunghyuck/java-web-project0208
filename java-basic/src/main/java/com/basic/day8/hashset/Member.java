package com.basic.day8.hashset;

public class Member {
  int memberId;
  String memberName;

  public Member(int memberId, String memberName) {
    super();
    this.memberId = memberId;
    this.memberName = memberName;
  }
  public Member() { }
  public int getMemberId() {
    return memberId;
  }
  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }
  public String getMemberName() {
    return memberName;
  }
  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }
  @Override
  public String toString() {
    return memberName + "님의 아이디는 = '" + memberId + "'입니다.";
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Member) {
      Member member = (Member) obj;
      System.out.println("이미 등록된 아이디 입니다.");
      return member.memberId == memberId;
    } else {
      return false;
    }
  }
  @Override
  public int hashCode() {
    return memberId;
  }
}


