package com.bitcamp;

import java.io.FileInputStream;

/* 한글 주석...*/
public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    
    try (
      FileInputStream in = new FileInputStream("build.gradle");
    ) {
      System.out.println("테스트...");
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
