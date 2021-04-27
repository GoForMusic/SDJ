import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Array4
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int number = 5;

    int[] array = new int[number];

    for(int index=0;index<array.length;index++)
    {
      System.out.print("Enter the number on index("+index+") : ");
      array[index] = keyboard.nextInt();
    }

    int numbers = 0;

    for(int index=0;index<array.length;index++)
    {
      numbers = numbers + array[index];
    }

    double average = (double)(numbers/array.length);

    System.out.println(average);

  }
}
