public class GradeList
{
  private int[] grades;

  public GradeList(int numberOfGrades)
  {
    this.grades = new int[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public int getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(int grade, int index)
  {
    this.grades[index] = grade;
  }

  public double getAverage()
  {
    int sum=0;

    for(int index=0;index<grades.length;index++)
    {
      sum = sum + grades[index];
    }

    return (double) sum/grades.length;
  }

  public String toString()
  {
    String localString="";

    for(int index=0;index<grades.length;index++)
    {
      localString = localString + grades[index] +" ";
    }

  return localString;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof GradeList))
    {
      return false;
    }

    GradeList gradeList = (GradeList)obj;

    boolean check = true;
    for(int index=0;index<grades.length;index++)
    {
      if(getGrade(index) != gradeList.getGrade(index))
      {
        check = false;
        break;
      }
    }

    return check;
  }

}
