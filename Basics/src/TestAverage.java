//Exercise 2.05[Gaddis] Programming Challenge 10, p. 147

import java.util.Scanner;

public class TestAverage
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("First number: ");
    double firstNumber = keyboard.nextDouble();
    System.out.print("Second number: ");
    double secondNumber = keyboard.nextDouble();
    System.out.print("Third number: ");
    double thirdNumber = keyboard.nextDouble();

    System.out.println("first: "+firstNumber+" second: "+secondNumber+" third: "+thirdNumber);


    System.out.println("Average is: " + (firstNumber + secondNumber + thirdNumber)/3);

  }
}

