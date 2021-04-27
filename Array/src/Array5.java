import java.util.Scanner;

public class Array5
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

    boolean check = true;

    for(int index=0;index< array1.length;index++)
    {
      if(array1[index]!=array2[index]) {
        check = false;
        break;
      }
    }

    if (check) {
      System.out.print("Are identical");
    }else {
      System.out.print("Are NOT identical");
    }

  }
}
