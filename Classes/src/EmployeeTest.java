//link to Employee

public class EmployeeTest
{
  public static void main(String[] args)
  {
    //create array for employee class and set the length = 3 (0,1,2)
    Employee[] employee = new Employee[3];

    //set info employee1
    employee[0] = new Employee();
    employee[0].setName("Susan Meyers");
    employee[0].setIdNumber(47899);
    employee[0].setDepartment("Accounting");
    employee[0].setPosition("Vice President");

    //set info employee2
    employee[1] = new Employee();
    employee[1].setName("Mark Jones");
    employee[1].setIdNumber(39119);
    employee[1].setDepartment("IT");
    employee[1].setPosition("Programmer");

    //set info employee3
    employee[2] = new Employee();
    employee[2].setName("Joy Rogers");
    employee[2].setIdNumber(81774);
    employee[2].setDepartment("Manufacturing");
    employee[2].setPosition("Engineer");

    System.out.println("Name \tID Number \tDepartment \tPosition");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    for(int index = 0; index < employee.length ; index++)
    {
      System.out.println(employee[index].getName() + "\t | " + employee[index].getIdNumber() + "\t | " + employee[index].getDepartment() + "\t | " + employee[index].getPosition() );
    }

  }
}
