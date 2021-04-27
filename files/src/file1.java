import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class file1
{
  public static void main(String[] args)
  {
    PrintWriter writer=null;
    Scanner keyboard = new Scanner(System.in);
    Scanner read=null;
    String filename = keyboard.nextLine();

    try
    {
      FileOutputStream fileOut = new FileOutputStream(filename);
      writer = new PrintWriter(fileOut);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    for(int index=0;index<4;index++)
    {
      String localString = keyboard.nextLine();
      //writer.write(localString);
      writer.println(localString);
    }

    writer.close();

    try{
      FileInputStream fileIn = new FileInputStream(filename);
      read = new Scanner(fileIn);
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }

    while(read.hasNext())
    {
      System.out.println(read.nextLine());
    }

    read.close();

  }
}
