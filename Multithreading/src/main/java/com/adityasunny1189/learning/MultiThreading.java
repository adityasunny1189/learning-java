package com.adityasunny1189.learning;

public class MultiThreading extends Thread {
  public static void main(String[] args) {
    MultiThreading mt = new MultiThreading();
    mt.start();

    for (int j = 0; j < 100; j++) {
      System.out.print("j: " + j + "\t");
    }
  }

  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.print("i: " + i + "\t");
    }
  }
}
