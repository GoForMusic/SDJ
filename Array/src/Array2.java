import java.util.Scanner;

public class Array2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int number = keyboard.nextInt();

    int[] sourceArray = new int[number];

    for(int index=0;index< sourceArray.length;index++)
    {
      System.out.print("Enter the number on position "+(index+1)+": ");
      sourceArray[index] = keyboard.nextInt();
    }

    int[] destinationArray = new int[sourceArray.length];

    for(int index=0;index<destinationArray.length;index++)
    {
      destinationArray[index]=sourceArray[index];
    }

    for(int index=0;index<destinationArray.length;index++)
    {
      System.out.println("source vector "+ (index+1) + ": " + sourceArray[index] );
      System.out.println("destination vector "+ (index+1) + ": " + sourceArray[index] );
    }

  }
}
