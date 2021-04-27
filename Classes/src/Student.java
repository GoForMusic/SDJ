//Create a class Student that has:
// a)Three instance variables: a name (String), a gender (char - then when you create objects in the main method use the values ‘M’ or ‘F’),
// and a student number (int).
// b)A 3-argument constructor setting all three instance variables.
// c)A 2-argument constructor with a name and a gender as argument.
// Assume that the student number is 0 if not set.
// d)Set methods for name and student number.
// Call the methods setName and setStudentNumber.
// e)Get methods for all three instance variables. Call the methods getName, getGender and getStudentNumber.
// Then create a test class (StudentTest) with a main method and test the class Student:
// f)Create at least three Student-objects.g)Call all the methods you made in class Student, i.e. both constructors,
// all set and get methods.h)Print out all information of each Student-object.

public class Student
{
  private String name;
  private char gender;
  private int studentNumber;

  public Student(String name, char gender, int studentNumber)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = studentNumber;
  }

  public Student(String name, char gender)
  {
    this.name = name;
    this.gender = gender;
    this.studentNumber = 0;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void setGender(char gender)
  {
    this.gender = gender;
  }

  public void setStudentNumber(int studentNumber)
  {
    this.studentNumber = studentNumber;
  }

  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  public int getStudentNumber()
  {
    return studentNumber;
  }

  public String toString()
  {
    return name +','+gender+','+studentNumber;

  }

}
