import java.util.Scanner;

public class TestStudent
{
  public static void main(String[] args)
  {
    Student student=new Student("Adrian", 0);

    Scanner keyboard = new Scanner(System.in);

    int grade = 0;

    while (true){
      grade=keyboard.nextInt();
      student.setGrade(grade);
      System.out.println(student);
    }

  }
}
