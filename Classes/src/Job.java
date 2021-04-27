//Exercise 5.02
// Create a class called Job
// a)Implement three instance variables: a job title, a monthly salary and an employee.
// Call the variables title, salary and employee, where title should be of type String,
// salary of type double, and employee of type Person (use one of the Person classes you have already implemented in the previous exercises).
// b)Add a 3-argument constructor setting all three instance variables.
// c)Add a 2-argument constructor with job title and salary as argument.
// Set the employee to null, a person with the name "No one", or similar.
// d)Add get and set methods for all the instance variables.
// e)Add a method givePercentageRaise(double percentage) that takes a percentage as argument and increases the salary with this percentage.
// An example: the salary is 200 and after calling givePercentageRaise(20) the new salary is increased by 20%,  i.e. 200*1,2 = 240.
// Now create a test class (JobTest) with a main method and test the class Job
// f)Create at least two Job-objects g)Call the methods you made in class Job, i.e. both constructors,
// all get and set methods, and the givePercentageRaise method.
// h)Print out all information of each Job-object.


public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    this.employee = null;
  }

  public void setTitle(String title)
  {
    this.title = title;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public void setEmployee(Person employee)
  {
    this.employee = employee;
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void getPercentageRaise(double percentage)
  {
    this.salary += this.salary*percentage/100;
  }

  public String toString()
  {
    return "Job title: " + getTitle() +"| salary: "+ getSalary()+"| Employee details: "+ getEmployee();
  }

}


