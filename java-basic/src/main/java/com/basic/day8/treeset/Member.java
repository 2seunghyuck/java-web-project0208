package com.basic.day8.treeset;

public class Member implements Comparable<Member>{
  int memberId;
  String memberName;

  public Member() {}
  public Member(int memberId, String memberName) {
    super();
    this.memberId = memberId;
    this.memberName = memberName;
  }
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
  public int compareTo(Member m) {
    return this.memberName.compareTo(m.memberName);
  }
}


