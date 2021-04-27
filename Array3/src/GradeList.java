import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grade;

  public GradeList()
  {
    grade = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    return grade.size();
  }

  public ArrayList<Grade> getAllGrade()
  {
    return grade;
  }

  public Grade[] getAllGradeAsArray()
  {
    Grade[] tempArray = new Grade[grade.size()];
    return grade.toArray(tempArray);
  }

  public void addGrade(Grade grade)
  {
    this.grade.add(grade);
  }

  public double getAverage()
  {
    int sum=0;
    for(int index=0;index<this.grade.size();index++)
    {
      sum += this.grade.get(index).getGrade();
    }

    return (double)sum/this.grade.size();
  }

  public String toString()
  {
    return grade.toString();
  }

}
