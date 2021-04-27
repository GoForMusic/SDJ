import java.io.*;
import java.util.Random;

public class testStudent
{
  public static void main(String[] args)
  {
    Student student = new Student("Adrian","Militaru","Romania");

    try
    {
      FileOutputStream outputStream = new FileOutputStream("student.bin");
      ObjectOutputStream writer = new ObjectOutputStream(outputStream);

      writer.writeObject(student);

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
      FileInputStream outputStream = new FileInputStream("student.bin");
      ObjectInputStream writer = new ObjectInputStream(outputStream);
      while (true)
      {
        try
        {
          System.out.println((Student)writer.readObject());
        }
        catch (EOFException eof)
        {
          break;
        }
        catch (ClassNotFoundException e)
        {
          e.printStackTrace();
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
