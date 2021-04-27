//main test class for Payroll class

import java.util.Scanner;

public class PayrollTest
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Payroll payroll = new Payroll();

    System.out.print("Please enter the employee Name: ");
    payroll.setEmployeeName(keyboard.nextLine());
    System.out.print("Please enter the employee horly pay rate:");
    payroll.setHorlyPayRate(keyboard.nextDouble());
    System.out.print("Please enter the employee number hours:");
    payroll.setNumberHours(keyboard.nextInt());

    System.out.println(payroll);
  }
}
