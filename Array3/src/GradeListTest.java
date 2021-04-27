public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList();
    Grade grade1 = new Grade("SDJ", 5);
    Grade grade2 = new Grade("RWD", 10);

    gradeList.addGrade(grade1);
    gradeList.addGrade(grade2);

    System.out.println(gradeList);
    Grade[] gradeArray = gradeList.getAllGradeAsArray();
    for(int index=0;index< gradeArray.length;index++)
    {
      System.out.print(gradeArray[index] + "  ");
    }




  }
}
