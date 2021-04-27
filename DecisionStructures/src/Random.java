//Exercise 8.01
// Write a program that generates a random number between 1 and 10,
// and then asks the user to try to guess it.
// When the user enters a guess, compare it with the random generated number,
// and then tell the user if the guess was correct, or not.

import java.util.Scanner;

public class Random
{
  public static void main(String[] args)
  {
    //random int betwwen 1 - 10;
    int randomInt = (int)(10.0 * Math.random());

    Scanner keyboard = new Scanner(System.in);
    System.out.println(randomInt);
    System.out.print("Enter the number:");
    int userInt= keyboard.nextInt();

    System.out.println(randomInt==userInt?"correct":"incorect");

  }
}
