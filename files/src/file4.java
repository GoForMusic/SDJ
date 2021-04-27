import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

public class file4
{
  public static void main(String[] args)
  {
    ArrayList<Student> students = new ArrayList<Student>();
    students.add(new Student("Adrian","Militaru","Ro"));
    students.add(new Student("Cristian","Militaru","Ro2"));

    try
    {
      FileOutputStream fileOut = new FileOutputStream("students.html");
      PrintWriter writer = new PrintWriter(fileOut);
      ArrayList<String> lines=new ArrayList<String>();
      lines.add("<html>");
      lines.add("<head>");
      lines.add("<title>$title</title>");
      lines.add("<style>");
      lines.add("body{");
      lines.add("background-color:ghostwhite;");
      lines.add("color:darkblue;");
      lines.add("}");
      lines.add("table,th,td{");
      lines.add("border:1px solid darkblue;");
      lines.add("}");
      lines.add("table{");
      lines.add("border-collapse:collapse;");
      lines.add("width:30%;");
      lines.add("}");
      lines.add("td{");
      lines.add("height:40px;");
      lines.add("text-align:center;");
      lines.add("}");
      lines.add("th{");
      lines.add("background-color:lightblue;");
      lines.add("}");
      lines.add("</style>");
      lines.add("</head>");
      lines.add("<body>");
      lines.add("<h1>$header</h1>");
      lines.add("<p>$paragraph1</p>");
      lines.add("<table>");
      lines.add("<tr><th>$tableHeader1</th><th>$tableHeader2</th></tr>");
      lines.add("<tr><td>$tableData1</td><td>$tableData2</td></tr>");
      lines.add("</table>");
      lines.add("</body>");
      lines.add("</html>");



      writer.close();
    }
    catch (FileNotFoundException e)
    {
      e.printStackTrace();
    }
  }
}
