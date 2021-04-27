public class IllegalGradeException extends RuntimeException
{
  public IllegalGradeException()
  {
    super("Invalid grade");
  }

  public IllegalGradeException(int grade)
  {
    super("Invalid grade: " + grade);
  }
}
