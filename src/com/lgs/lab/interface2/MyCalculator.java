package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;
import java.util.Scanner;

public class MyCalculator extends Menu implements Numerable{

  @Override
  public void devide() {
    if( ( firstNumber == 0 && secondNumber == 0)
        || (firstNumber == 0 && secondNumber !=0)
        || (firstNumber != 0 && secondNumber == 0)){
      System.out.println("На нуль ділити не можна");
    }else {
      int devide = firstNumber / secondNumber;
      System.out.println(firstNumber + " / " + secondNumber + " = " + devide);
    }
  }

  @Override
  public void minus() {
      int minus =  firstNumber - secondNumber;
      System.out.println( firstNumber + " - " + secondNumber + " = " + minus);
  }

  @Override
  public void multiply() {
     int multiply = firstNumber * secondNumber;
     System.out.println( firstNumber + " * " + secondNumber + " = " + multiply);
  }

  @Override
  public void add() {
    int add = firstNumber + secondNumber;
    System.out.println( firstNumber + " + " + secondNumber + " = " + add);
  }
}
