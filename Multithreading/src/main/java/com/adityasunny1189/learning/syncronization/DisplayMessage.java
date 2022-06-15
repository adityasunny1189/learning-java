package com.adityasunny1189.learning.syncronization;

public class DisplayMessage {
  public synchronized void sayHello(String name) {
    for (int i = 0; i < 10; i++) {
      System.out.println("hello " + name);
    }
  }
}
