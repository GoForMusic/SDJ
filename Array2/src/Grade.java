public class Grade
{
  private String courseName;
  private int grade;

  public Grade(String courseName, int grade)
  {
    this.courseName = courseName;
    this.grade = grade;
  }

  public String getCourseName()
  {
    return this.courseName;
  }

  public int getGrade()
  {
    return this.grade;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public void setGrade(int grade)
  {
    this.grade = grade;
  }

  public String toString()
  {
    return "Course name: " + courseName + ", grade: " + grade;
  }
}
