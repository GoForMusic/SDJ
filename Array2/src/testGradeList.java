public class testGradeList
{
  public static void main(String[] args)
  {
    Grade grade1 = new Grade("SDJ", 12);
    Grade grade2 = new Grade("RWD", -3);
    GradeList grades = new GradeList(2);
    
    grades.setGrade(grade1,0);
    grades.setGrade(grade2,1);

    System.out.println(grades);

  }
}
