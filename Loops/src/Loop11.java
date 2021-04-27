import java.util.Scanner;

public class Loop11
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    while (true)
    {
      System.out.print("Number:");
      int number = keyboard.nextInt();
      if (number > 0)
      {
        int sum = 0;
        for (int index = 1; index <= number; index++)
        {
          sum = sum + index;
        }
        System.out.println(sum);
        break;
      }
      else
      {
        System.out.println("Add only positive nonzero value!!");
      }

    }

  }
}

