//Exercise 6.01 Write a program that reads an age (int) from the keyboard and then prints a message.
// The message should depend on the typed value in the following way:
// •If the age is less than 0 display the message: "Error in age value".
// •If the age is between 0 and 12 (both included) display the message: "Child".
// •If the age is between 13 and 19 (both included) display the message: "Teenager".
// •If the age is between 20 and 65 (both included) display the message: "Adult".
// •If the age is larger than 65 display the message: "Senior citizen".
// Test the program by running it at least 5 times to be sure that it will print out the correct message for each age group.

import java.util.Scanner;

public class Decission1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("number: ");
    int number = keyboard.nextInt();

    if(number < 0)
    {
      System.out.println("Error in age value because the ("+number+") is negative");
    }
    if(number >= 0 && number<=12)
      {
        System.out.println("Child");
      }
    if(number >= 13 && number<=19)
    {
      System.out.println("Teenager");
    }
    if(number >= 20 && number<=65)
    {
      System.out.println("Adult");
    }
    if(number > 65)
    {
      System.out.println("Senior citizen");
    }
    String test = (number > 65) ? "senior citizen" : "idk";
    System.out.println(test);

  }
}
