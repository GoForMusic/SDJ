import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class testStudent2
{
  public static void main(String[] args)
  {
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("Adrian","Militaru","Ro"));
    students.add(new Student("Cristian","Militaru","Ro2"));

    try
    {
      FileOutputStream fileOut = new FileOutputStream("students.xml");
      PrintWriter writer = new PrintWriter(fileOut);
      writer.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
      writer.println("<students>");
      for(Student student:students)
      {
        writer.println("  <student>");
        writer.println("    <firstname>"+student.getFirstName()+"</firstname>");
        writer.println("    <lastname>"+student.getLastName()+"</lastname>");
        writer.println("    <country>"+student.getCountry()+"</country>");
        writer.println("  </student>");
      }
      writer.println(" </students>");
      writer.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }



  }
}
