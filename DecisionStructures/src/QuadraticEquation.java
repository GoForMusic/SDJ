//Exercise 6.06
// Create a program that asks the user to input values for a, b and c, then calculates the
//solutions (if any) to a quadratic equation defined by those values, and prints them out.
//Remember that in Java the square root of a number is found by: Math.sqrt(number).

import java.util.Scanner;

public class QuadraticEquation
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("a:");
    double a = keyboard.nextDouble();
    System.out.print("b:");
    double b = keyboard.nextDouble();
    System.out.print("c:");
    double c = keyboard.nextDouble();

    double D = Math.pow(b,2) - 4*a*c;

    if(D < 0.0)
    {
     System.out.println("There is no solution!");
    }else if(D>0)
    {
      double x1=(-b+Math.sqrt(D))/(2*a);
      double x2=(-b-Math.sqrt(D))/(2*a);
      System.out.println("x1="+x1+" x2="+x2);
    }else if(D==0)
    {
      double x = -(b/2*a);
      System.out.println("x="+x);
    }

  }
}
