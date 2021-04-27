//Exercise 09.02
// Our current concept of leap years was started in 1582 when the Gregorian calendar was introduced.
// From previous exercises you should have a MyDate class with an isLeapYear() method.
// Use that for the following:
// a)Create a program with a main method that uses a for-loop and a MyDate object to calculate how many leap years there have been since 1582,
// and then prints out the result. Hint: set the MyDate object to all the years, and check which ones are leap years.
// b)Modify the program by adding a Scanner object, allowing the user to input a start year and an end year.
// Then the program should calculate the number of leap years within that range.

import java.util.Scanner;

public class Loop2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Insert the start year: ");
    int startYear = keyboard.nextInt();
    System.out.print("Insert the end year: ");
    int endYear = keyboard.nextInt();

    int years=0;

    MyDate[] date = new MyDate[endYear-startYear];

    for (int index = 0; index < endYear - startYear; index++)
    {
      date[index] = new MyDate();
      date[index].setYear(startYear+index);
    }

    for (int index = 0; index < endYear - startYear; index++)
    {
      if (date[index].isLeapYear())
      {
        years++;

      }
    }

    System.out.print(years + " ");

  }
}
