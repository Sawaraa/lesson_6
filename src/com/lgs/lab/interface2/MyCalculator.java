package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {

  @Override
  public void devide() {
    int devide = 10/5;
    System.out.println("10 / 5 = " + devide);
  }

  @Override
  public void minus() {
      int minus = 10-5;
      System.out.println("10 - 5 = " + minus);
  }

  @Override
  public void multiply() {
     int multiply = 10 *5;
     System.out.println("10 * 5 = " + multiply);
  }

  @Override
  public void add() {
    int add = 10 +5;
    System.out.println("10 + 5 = " + add);
  }
}
