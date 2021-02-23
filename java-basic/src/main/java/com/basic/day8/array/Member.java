package com.basic.day8.array;

public class Member {
  int memberId;
  String memberName;

  public Member(int memberId, String memberName) {
    super();
    this.memberId = memberId;
    this.memberName = memberName;
  }
  public Member() {
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
    return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
  }
  public String toString(String str) {
    return str;
  }

}
