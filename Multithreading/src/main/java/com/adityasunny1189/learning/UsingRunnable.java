package com.adityasunny1189.learning;

public class UsingRunnable implements Runnable{

  @Override
  public void run() {
    System.out.println("Thread is running");
  }

  public static void main(String[] args) {
    UsingRunnable ur = new UsingRunnable();

    Thread t = new Thread(ur);
    t.start();
  }
}
