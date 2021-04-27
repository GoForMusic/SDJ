//Exercise 6.04 Sort numbers:
// a)Write a program that asks the user to enter two numbers and prints the smallest of the numbers.
// b)Write a program that asks the user to enter two numbers and prints the numbers in sorted order (smallest number first).
// c)Write a program that asks the user to enter three numbers and prints the numbers in sorted order (smallest number first).
// d)(Optional) Write a program that asks the user to enter four numbers and prints the numbers in sorted order (largest number first).


import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Decission4
{

  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int[] numbers = new int[2];
    int[] numbers2 = new int[3];
    int[] numbers3 = new int[4];
    //a
    setArray(numbers,keyboard);
    System.out.print("a: ");
    if(numbers[0]>numbers[1])
    {
      System.out.print(numbers[1]);
    }else{
      System.out.print(numbers[0]);
    }
    //b
    Arrays.sort(numbers);
    System.out.print("b: ");
    printArray(numbers);

    //c
    setArray(numbers2, keyboard);
    Arrays.sort(numbers2);
    System.out.print("c: ");
    printArray(numbers2);

    //d
    setArray(numbers3, keyboard);
    //revers sort
    setArraySortDesc(numbers3);
    System.out.print("d: ");
    printArray(numbers3);
    printArray(numbers3);
  }

  public static void setArray(int Array[], Scanner keyboard)
  {
    for(int index=0;index< Array.length;index++)
    {
      System.out.print("Enter the number:");
      Array[index] = keyboard.nextInt();
    }
  }

  public  static void printArray(int Array[])
  {
    for(int index=0;index< Array.length;index++)
    {
      System.out.print(Array[index]+" ");
    }
    System.out.print("\n");
  }

  public static void setArraySortDesc(int Array[])
  {
    int temp=0;
    for( int index = 0; index < Array.length/2; ++index )
    {
      temp = Array[index];
      Array[index] = Array[Array.length - index - 1];
      Array[Array.length - index - 1] = temp;
    }
  }

}
