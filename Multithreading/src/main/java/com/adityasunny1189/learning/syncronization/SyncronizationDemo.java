package com.adityasunny1189.learning.syncronization;

public class SyncronizationDemo {
  public static void main(String[] args) {
    DisplayMessage dm = new DisplayMessage();

    MyThread t1 = new MyThread(dm, "Aditya");
    t1.start();

    MyThread t2 = new MyThread(dm, "Amit");
    t2.start();
  }
}
