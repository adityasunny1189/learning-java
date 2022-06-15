package com.adityasunny1189.learning;

import java.util.Scanner;

public class JoinDemo extends Thread{
  static int n, sum = 0;

  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    JoinDemo.n = sc.nextInt();

    JoinDemo jd = new JoinDemo();
    jd.start();
    try {
      jd.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Sum of first " + JoinDemo.n + " numbers are: " + JoinDemo.sum);
    long end = System.currentTimeMillis();

    System.out.println("Time taken to run the program: " + (end-start)/1000 + " Seconds");
  }

  public void run() {
    for (int i = 1; i <= JoinDemo.n; i++) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      JoinDemo.sum += i;
    }
  }
}
