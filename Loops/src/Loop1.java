//Exercise 09.01
// Write a program that asks the user to input an int, n, and then prints out the following:
// a)All the numbers 1, 2, 3, ..., n
// b)All the numbers 2, 4, 6, ..., 2*n
// c)All the numbers 1, 4, 9, ..., n2

import java.util.Scanner;

public class Loop1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter n numbers: ");
    int n = keyboard.nextInt();

    for(int index = 1; index <= n; index++ )
    {
      System.out.print(index+" ");
    }

    System.out.print("\n");

    for(int index = 2; index<= 2*n; index+=2)
    {
        System.out.print(index+" ");
    }

    System.out.print("\n");

    for(int index = 1; index<= n*n;index++)
    {
      System.out.print((index*index)+" ");
    }

  }
}
