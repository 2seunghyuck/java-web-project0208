package com.basic.day7.exception;

public class BalanceInsufficientException extends Exception{
  public BalanceInsufficientException() {}
  public BalanceInsufficientException(String message) {
    super(message);
  }

}
