//Exercise 09.06
// Guess a number part 2.
// Write a program that generates a random number between 1 and 1000,
// and then asks the user to try and guess it.
// Every time the user makes a wrong guess, display whether the guess was too high or too low,
// and ask the user to make another guess. When the user guesses the right number,
// display how many attempts were needed.

import java.util.Random;
import java.util.Scanner;

public class Loop5
{
  public static void main(String[] args)
  {
    //random between 1-1000
    Random random= new Random();

    int randomNumber = random.nextInt(1000+1)+1;

    System.out.println("-------DEBUG----" + randomNumber);

    int attempts=0;

    while(true)
    {
      System.out.print("Enter the number: ");
      Scanner keyboard = new Scanner(System.in);
      int userNumber = keyboard.nextInt();

      if(randomNumber==userNumber)
      {
        System.out.println("-You get the right number, " + attempts + " attempts.-");
        break;
      }else{
        if(userNumber<randomNumber)
        {
          System.out.println("-Your number is lower!-");
          attempts++;
        }else if(userNumber>randomNumber)
        {
          System.out.println("-Your number is higher!-");
          attempts++;
        }
      }

    }

  }
}
