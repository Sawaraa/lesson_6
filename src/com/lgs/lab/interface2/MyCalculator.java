package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;
import java.util.Scanner;

public class MyCalculator implements Numerable {
  Scanner scanner = new Scanner(System.in);

  int firstNumber;
  int secondNumber;
  void menu(){
    System.out.println("Введіть першу цифру");
     firstNumber = scanner.nextInt();
    System.out.println("Введіть другу цифру");
     secondNumber = scanner.nextInt();

     scanner.close();
  }
  @Override
  public void devide() {
    if( secondNumber == 0){
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
