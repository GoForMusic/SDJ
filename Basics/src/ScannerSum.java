//Exercise 2.02Write an application that reads three integers from the keyboard and displays the sum and the product on the screen.

import java.util.Scanner;

public class ScannerSum
{
  public static void main(String[] args)
  {
    //scanner keyboard
    Scanner keyboard = new Scanner(System.in);
    System.out.print("First Number: ");
    int firstNumber = keyboard.nextInt();
    System.out.print("Second Number: ");
    int secondNumber = keyboard.nextInt();
    System.out.print("Third Number: ");
    int thirdNumber = keyboard.nextInt();

    System.out.print("Sum:"+(firstNumber+secondNumber+thirdNumber)+"\nProduct: "+(firstNumber*secondNumber*thirdNumber));

  }
}
