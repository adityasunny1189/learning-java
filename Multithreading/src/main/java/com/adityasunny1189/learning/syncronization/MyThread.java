package com.adityasunny1189.learning.syncronization;

public class MyThread extends Thread{
  DisplayMessage dm;
  String name;

  MyThread(DisplayMessage dm, String name) {
    this.dm = dm;
    this.name = name;
  }

  public void run() {
    dm.sayHello(this.name);
  }
}
