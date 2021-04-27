public class GradeListTest
{
  public static void main(String[] args)
  {
    GradeList gradeList = new GradeList(7);

    gradeList.setGrade(-3,0);
    gradeList.setGrade(0,1);
    gradeList.setGrade(2,2);
    gradeList.setGrade(4,3);
    gradeList.setGrade(7,4);
    gradeList.setGrade(10,5);
    gradeList.setGrade(12,6);


    System.out.println(gradeList);

  }
}
