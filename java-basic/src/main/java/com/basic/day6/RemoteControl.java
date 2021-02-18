package com.basic.day6;

public interface RemoteControl {
  // 상수
  int MAX_VOLUME =10;
  int MIN_VOLUME =10;

  // 추상 메서드
  void turnOn();
  void turnOff();
  void setVolume(int volume);

  default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음입니다.");
    } else {
      System.out.println("무음을 해제합니다");
    }
  }
  static void changeBattery() {
    System.out.println("건전지를 교환합니다.");
  }
}
