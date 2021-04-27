public class GradeList
{
  private Grade[] grade;

  public GradeList(int numberOfGrades)
  {
    this.grade = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grade.length;
  }

  public Grade getGrade(int index)
  {
    return this.grade[index];
  }

  public void setGrade(Grade grade, int index)
  {
    this.grade[index] = grade;
  }

  public double getAverage()
  {
    double sum=0;

    for(int index=0;index<grade.length;index++)
    {
      sum += (double) grade[index].getGrade();
    }
    return sum/grade.length;
  }

  public String toString()
  {
    String localString="";

    for(int index=0;index<grade.length;index++)
    {
      localString += grade[index] + "\n";
    }

    return localString;
  }
}
