package first_task;

import java.util.Scanner;

public class emp_hour_salary implements Salary{

  Scanner scanner = new Scanner(System.in);
  int pay_hour = 100; //кільки заробляє за годину
  int hour_work = 7;  //скільки в день працює
  int day_work;  //скільки працює днів в місяці
  @Override
  public void salary() {
      System.out.println("How many days do you work per month?");
      day_work = scanner.nextInt();
      int salary = pay_hour * hour_work * day_work;
      System.out.println("Salary employee with an hourly salary is - " + salary);
  }
}
