//Exercise 09.05
// Write a program that prompts the user for a string,
// and prints its reverse.
// E.g. the string "Hello" typed on the keyboard will be printed out as "olleH".
// Keep doing this over and over, until the user enters the string "quit".
// Note that the method charAt(index) in the String class can be used to get the character at a specific index in the string,
// and the method length() can be used to get the number of characters in the string. When comparing strings, the method equals()
// might be useful.

import java.util.Scanner;

public class Loop4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    while (true)
    {
      System.out.print("Enter a word: ");
      String word = keyboard.nextLine();
      if(word.equals("quit"))
      {
        System.out.println("Program close");
        break;
      }else {
        String reverse = "";

        for (int index = word.length() - 1; index >= 0; index--)
        {
          reverse = reverse + word.charAt(index);
        }

        System.out.println(reverse);
      }
    }


  }
}
