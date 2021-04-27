import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class file3
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int noNumbers= keyboard.nextInt();

    try
    {
      FileOutputStream outputStream = new FileOutputStream("file3.bin");
      ObjectOutputStream writer = new ObjectOutputStream(outputStream);
      for(int index=0;index<noNumbers;index++)
      {
        writer.writeInt(new Random().nextInt(10));
      }
      writer.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

    try
    {
      FileInputStream outputStream = new FileInputStream("file3.bin");
      ObjectInputStream writer = new ObjectInputStream(outputStream);
      while (true)
      {
        try
        {
          int localInt = writer.readInt();
          System.out.println(localInt);
        }
        catch (EOFException eof)
        {
          break;
        }
      }
      writer.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }

  }
}
