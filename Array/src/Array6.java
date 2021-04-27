import java.util.Scanner;

public class Array6
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    int[] array1 = new int[4];
    int[] array2 = new int[4];

    for(int index=0;index< array1.length;index++)
    {
      System.out.print("Enter the number on index("+index+") : ");
      array1[index] = keyboard.nextInt();
    }

    for(int index=0;index< array2.length;index++)
    {
      System.out.print("Enter the number on index("+index+") : ");
      array2[index] = keyboard.nextInt();
    }

   int[] sumArray = new int[4];

    for(int index=0;index< array1.length;index++)
    {
      sumArray[index] = array1[index] + array2[index];
    }

    for(int index=0;index< sumArray.length;index++)
    {
      System.out.print(sumArray[index] + " ");
    }

  }
}
