//1. Write a while loop that lets the user enter a number. The number should be multiplied
//by 10 and the result stored in the variable product. The loop should iterate as long as
//product contains a value less than 100.

import java.util.Scanner;

public class Loop9
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Number:");
    int number = keyboard.nextInt();
    int product=1;

    while(product<100)
    {
      product =product*(number*10);
    }

    System.out.print(product);

  }
}
