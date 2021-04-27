import java.util.Scanner;

public class DriveExamTest
{
  public static void main(String[] args)
  {

    DriverExam exam = new DriverExam();

    //exam.setInputs();

    System.out.println(exam.passed());
    System.out.println(exam.totalCorrect());
    System.out.println(exam.returnIncorrect());

    for (int index = 0; index < exam.questionsMissed().length; index++)
    {
      System.out.print(exam.questionsMissed()[index] + " ");
    }

  }
}
