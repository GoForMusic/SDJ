public class Array1
{
  public static void main(String[] args)
  {
    int[] array = {1,2,3,4,5};
    System.out.println("\n");

    for(int index=0;index< array.length;index++)
    {
      array[index] = array[index] *2;
    }

    for(int index=0;index< array.length;index++)
    {
      System.out.print(array[index] + " ");
    }

  }
}
