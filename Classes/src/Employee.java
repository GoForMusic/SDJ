//Write a class named Employee that has the following fields:
//r name. The name field is a String object that holds the employee’s name.
//r idNumber. The idNumber is an int variable that holds the employee’s ID number.
//
//r department. The department field is a String object that holds the name of the depart-
//ment where the employee works.
//
//r position. The position field is a String object that holds the employee’s job title.
//Write appropriate mutator methods that store values in these fields and accessor methods
//that return the values in these fields. Once you have the written the class, write a separate
//program that creates three Employee objects to hold the following data.
//The program should store this data in the three objects and then display the data for each
// employee on the screen.


public class Employee
{
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public void setName(String name)
  {
    this.name = name;
  }

  public void setDepartment(String department)
  {
    this.department = department;
  }

  public void setIdNumber(int idNumber)
  {
    this.idNumber = idNumber;
  }

  public void setPosition(String position)
  {
    this.position = position;
  }

  public String getName()
  {
    return name;
  }

  public int getIdNumber()
  {
    return idNumber;
  }

  public String getDepartment()
  {
    return department;
  }

  public String getPosition()
  {
    return position;
  }


}
