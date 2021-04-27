import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file2
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String filename = keyboard.nextLine();

    try
    {
      FileInputStream fileIn = new FileInputStream(filename);
      keyboard = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
      System.exit(1);
    }

    while (keyboard.hasNext())
    {
      System.out.println(keyboard.nextLine());
    }

    keyboard.close();
  }
}
