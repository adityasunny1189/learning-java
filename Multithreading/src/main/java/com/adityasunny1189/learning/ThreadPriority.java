package com.adityasunny1189.learning;

public class ThreadPriority extends Thread{
  public static void main(String[] args) {
    ThreadPriority tp1 = new ThreadPriority();
    tp1.setPriority(MAX_PRIORITY);
    tp1.setName("tp1");
    tp1.start();

    ThreadPriority tp2 = new ThreadPriority();
    tp2.setPriority(MIN_PRIORITY);
    tp2.setName("tp2");
    tp2.start();

    ThreadPriority tp3 = new ThreadPriority();
    tp3.setPriority(NORM_PRIORITY);
    tp3.setName("tp3");
    tp3.start();
  }

  public void run() {
    System.out.println("Thread Name: " + Thread.currentThread().getName());
  }
}
