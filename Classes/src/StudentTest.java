//link to Student class



public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Adrian", 'M', 122324);
    Student student2 = new Student("Test", 'F');
    Student student3 = new Student("Test2" , 'M');

    student2.setStudentNumber(112214);
    student3.setName("Adrian22");
    student3.setGender('F');

    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);
  }
}
